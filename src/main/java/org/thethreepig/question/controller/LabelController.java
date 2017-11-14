package org.thethreepig.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thethreepig.question.service.LabelService;


/**
 * Created by 王有名 on 2017/11/12.
 * 标签控制器
 */
@Controller
@RequestMapping("label")
public class LabelController {
    @Autowired
    LabelService labelService;

    @RequestMapping(value="getLabel",method= RequestMethod.POST)
    @ResponseBody
    public Object getLbael(){
        return null;
    }
}
