package com.gontuseries.hellocontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AjaxController {

	
	@RequestMapping({"/ajax","/ajaxcall"})
	public ModelAndView ajaxWelcomePage(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("ajaxtest");
		modelandview.addObject("welcomeMsg", "Welcome to ajax test page");
		return modelandview;
	}
	
	
	@PostMapping("/ajaxSubmit")
	public ModelAndView ajaxSubmit(HttpServletRequest request, HttpServletResponse response/*, @RequestBody Map<String,Object> params*/) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("ajaxtest");
		System.out.println("Custom Name:::"+request.getParameter("name"));
		System.out.println("Custom Name:::"+request.getParameter("username"));
		modelandview.addObject("welcomeMsg", "Welcome to ajax test page2");
		return modelandview;
	}
	
}
