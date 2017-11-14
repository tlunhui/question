package org.thethreepig.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thethreepig.question.service.ProblemService;

/**
 * Created by 王有名 on 2017/11/8.
 *
 */
@Controller
@RequestMapping("problem")
public class ProblemController {

    @Autowired
    ProblemService problemService;

    @RequestMapping(value = "/newProblems", method = RequestMethod.GET)
    @ResponseBody
    public Object findNewProblem(@RequestParam("page") int page) {
        return problemService.getNewProblem(page);
    }
}
