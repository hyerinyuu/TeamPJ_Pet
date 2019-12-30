package com.biz.pet.controller;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "redirect:/hospital/hlist";
	}
	
	@RequestMapping(value="/privacy", method=RequestMethod.GET)
	public String privacy(Model model) {
		
		return "/privacy";
	}
	
}
