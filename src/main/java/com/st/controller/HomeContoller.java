package com.st.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class HomeContoller {

	@RequestMapping("/show")
	public String showPage(Model map) {
		map.addAttribute("msg", "this is first App :"+new Date());
		return "Home";
	}
}
