package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("home")
	public String showHomePage(Model model) {
		model.addAttribute("data", "This is First Controller");
		return "home";
	}

}
