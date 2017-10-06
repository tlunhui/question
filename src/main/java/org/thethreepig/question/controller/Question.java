package org.thethreepig.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thethreepig.question.model.Users;
import org.thethreepig.question.service.UsersService;

/**
 * Created by zhaod on 2017/9/17.
 */
@Controller
public class Question {

	@Autowired
	UsersService usersService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Users> list = usersService.login("123456", "123456");
		return "index";
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
}
