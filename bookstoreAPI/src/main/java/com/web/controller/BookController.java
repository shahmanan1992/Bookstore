package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/book")
public class BookController{

	@RequestMapping(value="/addBook",method=RequestMethod.GET)  
	@ResponseBody
		 public String addBook(
				 @RequestParam String name) {  
		  String result="Hello "+name;    
		  return result;  
		 }

	@RequestMapping(value="/login.html",method=RequestMethod.GET)  
	public ModelAndView login() {  
		ModelAndView mod=new ModelAndView("index");
		return mod;  
	}
	
	@ModelAttribute
	public void addAttr(Model mod1)
	{
		mod1.addAttribute("headerMessage", "Wallace Library");
	}
	
	@RequestMapping(value="/submission.html",method=RequestMethod.POST)  
	public ModelAndView addBook(@RequestParam("id") String id,@RequestParam("pwd") String pwd) {  
		ModelAndView mod=new ModelAndView("submitted");
		mod.addObject("message", "Successfully entered information. Your username is "+ id+" and password is "+pwd);    
		return mod;  
	}

	//	@Override
	//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	//		ModelAndView mode=new ModelAndView("Home");
	//		mode.addObject("message", "Jinali is great");
	//		return mode;
	//	}  
}
