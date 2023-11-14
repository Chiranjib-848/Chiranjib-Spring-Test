package com.gontuseries.hellocontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value= {"/welcome","/hi"})
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMsg", "Welcome to spring mvc Annotation Tutorial");
		return modelandview;
	}
	
	//@PathVariable Example
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView pathVariable(HttpServletRequest request, HttpServletResponse response, @PathVariable("userName") String userName
			,@PathVariable("countryName") String country) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMsg", "Hi "+userName+" from "+country+",welcome to spring mvc Annotation Tutorial");
		return modelandview;
	}
	
	
	@RequestMapping("/welcome2/{countryName}/{userName}")
	public ModelAndView pathVariableMap(HttpServletRequest request, HttpServletResponse response, @PathVariable Map<String,String> pathVars) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMsg", "Hi "+pathVars.get("userName")+" from "+pathVars.get("countryName")+",welcome to spring mvc Annotation Tutorial");
		return modelandview;
	}
	
	
	@RequestMapping("/formSubmitTest")
	public ModelAndView formSubmitTest() throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("formSubmitTest");
		//modelandview.addObject("welcomeMsg", "Welcome to spring mvc Annotation Tutorial");
		return modelandview;
	}
	
	@RequestMapping("/formSubmitTestSuccess")//@RequestParam(value="studentName", defaultValue="Chiranjib") String studentName
	public ModelAndView formSubmitTest(@RequestParam("studentName") String studentName, @RequestParam("studentHobby") String studentHobby) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("formSubmitSuccess");
		modelandview.addObject("successMsg", "Form Submitted Successfully:: Student Name:: "+studentName+", Student Hobby:: "+studentHobby);
		return modelandview;
	}
	
	@RequestMapping("/formSubmitTestSuccess2")//@RequestParam(value="studentName", defaultValue="Chiranjib") String studentName
	public ModelAndView formSubmitTest2(@RequestParam Map<String,String> params) throws Exception 
	{
		ModelAndView modelandview = new ModelAndView("formSubmitSuccess");
		modelandview.addObject("successMsg", "Form Submitted Successfully:: Student Name:: "+params.get("studentName")+", Student Hobby:: "+params.get("studentHobby"));
		return modelandview;
	}

}
