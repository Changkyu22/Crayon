package com.nuri.s5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq/**")
public class FaqController {

	@GetMapping("faqHome")
	public void faq() throws Exception{
		
	}
	
	
}
