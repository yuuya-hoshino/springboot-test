package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//このプログラムがcontrollerの役割をする定義
@Controller
public class LoginController {
	//"login"という名前のHTMLを表示してください
	@GetMapping("/login")
	public String view() {
		return"login";
	}
}
