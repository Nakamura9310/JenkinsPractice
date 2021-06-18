package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.UService;

@Controller
public class UController {
	
	@Autowired
	private UService service;
	
	@GetMapping("users")
	public String selectAll(Model model) {
		List<User> userList = service.selectAll();
		model.addAttribute("users", userList);
		return "list";
	}

}
