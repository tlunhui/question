package org.thethreepig.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thethreepig.question.service.UsersService;
import sun.reflect.generics.repository.MethodRepository;

/**
 * Created by 王有名 on 2017/11/12.
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UsersService usersService;

    @RequestMapping(value="activer",method = RequestMethod.POST)
    @ResponseBody
    public String getActiver(){
        return null;
    }
}
