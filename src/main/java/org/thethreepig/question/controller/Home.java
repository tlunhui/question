package org.thethreepig.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thethreepig.question.model.Problem;
import org.thethreepig.question.model.ProblemLaber;
import org.thethreepig.question.model.Users;
import org.thethreepig.question.service.ProblemService;
import org.thethreepig.question.service.UsersService;

/**
 * Created by 王有名 on 2017/9/17.
 */
@Controller
public class Home {

    @Autowired
    UsersService usersService;

    @Autowired
    ProblemService problemService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        return "/index.html";
    }

    @RequestMapping(value = "/newProblems", method = RequestMethod.GET)
    @ResponseBody
    public Object findNewProblem(Problem problem) {
        Page<Problem> page = new Page<Problem>();
        page.setCurrentNum(bizFrontProblem.getPage());
        problemHandler.selectNewProblems(page);
        return page;
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "/WEB-INF/views/index.html";
    }
}
