package org.thethreepig.question.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thethreepig.question.model.Param;
import org.thethreepig.question.model.Response;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by 王有名 on 2017/11/12.
 */

@Aspect
@Component
public class RequestAspect {

    Logger logger= LoggerFactory.getLogger(RequestAspect.class);

    /**
     * 添加 切点
     * 添加注解 匹配org.therthreeping.question.controller包下的所有类的所有方法都属于切点
     * */
    @Pointcut("execution(* org.thethreepig.question.controller.*.*(..))")
    public void pointCut_() {
    }

    /**
     * 切面插入点
     * */
    @Around("pointCut_()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object[] objects = proceedingJoinPoint.getArgs();
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Param) {
                Param param = (Param) objects[i];
                param.check();
            }
        }
        MethodSignature joinPointObject = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = joinPointObject.getMethod();
        boolean flag = method.isAnnotationPresent(ResponseBody.class);
        Object returnObject = null;
        try {
            returnObject = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if (flag && method.getReturnType().equals(Void.TYPE)) {
            voidResponse();
        }
        if (flag && !method.getReturnType().equals(Void.TYPE)) {
            return Response.success(returnObject);
        } else {
            return returnObject;
        }

    }

    private void voidResponse() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(response.getOutputStream(), Response.success());
        } catch (IOException e) {
            logger.error("Response error", e);
        }
    }
}
