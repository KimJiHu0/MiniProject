package com.jihu.book.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/signupform")
	public String MemberRegisterForm() {
		return "/login/Register";
	}

}
