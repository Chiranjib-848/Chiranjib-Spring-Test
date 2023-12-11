package com.gontuseries.hellocontroller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	

@GetMapping(value="/account/availability",produces=MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public String getAvailability(@RequestParam String name) {
    /*for (Account a : accounts.values()) {
        if (a.getName().equals(name)) {
            return AvailabilityStatus.notAvailable(name);
        }
    }*/
	
	Map<String,String> prms = new HashMap<String,String>();
	if(name.contains("t")) {
		prms.put("present", "yes");
		System.out.println("Test ok");
	}
	JSONObject jsonObject = new JSONObject(prms);
    String orgJsonData = jsonObject.toString();
    return orgJsonData;
}

	
}
