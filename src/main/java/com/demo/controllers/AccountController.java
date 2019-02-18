package com.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entities.Account;
import com.demo.servcices.AccountService;

@Controller
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(value="register" ,method  = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		modelMap.put("acc", new Account());
		return "account.register";
	}
	
	
	@RequestMapping(value="register" ,method  = RequestMethod.POST)
	public String register(@ModelAttribute("acc") Account account ) {
		accountService.saveAccount(account);
		return "redirect:/account/myaccount";
	}
	
	
	
	
	@RequestMapping(value="myaccount" ,  method  = RequestMethod.GET)
	public String myaccount() {
			return "account.myaccount";
		
	}
	
	
	@RequestMapping(value="myaccount" ,  method  = RequestMethod.POST)
	public String myaccount(HttpSession session , @RequestParam("username") String username , @RequestParam("password") int password , ModelMap modelMap) {
		if (accountService.login(username, password) == null) {
			modelMap.put("msg", "Inavlid Data");
			return "account.myaccount";
		}else {
			session.setAttribute("username", username);
			return "account.welcome";
		}
		
	}
	
	@RequestMapping(value="logout" ,  method  = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:/account/myaccount";
	}

	
	
	
}
