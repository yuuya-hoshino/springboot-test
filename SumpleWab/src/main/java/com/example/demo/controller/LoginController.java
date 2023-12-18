package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LoginForm;

//このプログラムがcontrollerの役割をする定義
@Controller
public class LoginController {
	//"login"という名前のHTMLを表示してください
	@GetMapping("/login")
	public String view(Model model,LoginForm form) {
		
		return"login";
	}
	
	@PostMapping
	public void login(LoginForm form) {
		System.out.println(form.toString());
	}
}
