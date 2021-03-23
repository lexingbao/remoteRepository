package com.lexing.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lexing.sys.model.User;
import com.lexing.sys.service.UserService;

@Controller("hello.controller")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String helloWord(Model mo,String openId){
		String msg = "Hello";
		int result; 
		
		User u = userService.getByOpenId(openId);
		if(u!=null){
			msg = u.getNickname();
			u.setBind(0);
			u.setPassword("888888");
			u.setName("TEST");
			result = userService.update(u);
			msg = msg+"||result="+String.valueOf(result);
		}
		
		mo.addAttribute("message",msg);
		
		userService.testCache();
		
		
		return "/login/hello";
	}
}
