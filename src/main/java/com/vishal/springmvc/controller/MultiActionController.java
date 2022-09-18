package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MultiActionController {
	@GetMapping("{id}/{name}/{designation}")
	public String showPathVariableDemo(Model model,
			@PathVariable("id") int id, @PathVariable("name") String name,@PathVariable("designation") String designation) {
		String data = id+"\t"+name+"\t"+designation;
		model.addAttribute("data", data);
		return "home";
	}

}
