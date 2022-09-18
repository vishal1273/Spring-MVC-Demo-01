package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mac")
public class PathVariableController {
	@GetMapping("/showHiPage")
	public String showHiPage(Model model) {
		model.addAttribute("data", "This is Hi Page");
		return "home";
	}
	@GetMapping("/showHelloPage")
	public String showHelloPage(Model model) {
		model.addAttribute("data", "This is Hello Page");
		return "home";
	}

}
