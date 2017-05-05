package lk.dinuka.spring_only.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password, ModelMap model) {
		System.out.println("input params : " + username + " " + password);
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "../../index";
	}
}
