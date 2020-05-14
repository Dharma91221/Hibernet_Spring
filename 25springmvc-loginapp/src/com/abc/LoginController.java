package com.abc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="/login")
	public ModelAndView display()
	{
		UserTO uo = new UserTO();
		return new ModelAndView("enter", "uto", uo );
	}
	
	@RequestMapping(value="/check")
	public String checkuser(UserTO user)
	{
		if (user.getName().equals("anand") && user.getPassword().equals("anand")) 
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}
