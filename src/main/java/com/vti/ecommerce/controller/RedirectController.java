package com.vti.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.vti.ecommerce.entities.UsersEntity;

@Controller
@RequestMapping("")
public class RedirectController {

	@PostMapping("/login")
	public RedirectView login(@RequestParam UsersEntity user, RedirectAttributes redirectAttributes) {

		
		return new RedirectView("categories");
	}

	@GetMapping("/categories")
	public String page2(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name.toUpperCase());
		return "page2";
	}

}
