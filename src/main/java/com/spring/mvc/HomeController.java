package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String form() {
		return "form";
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	//public ModelAndView add(HttpServletRequest req, HttpServletResponse resp) {
	public ModelAndView add(@RequestParam("nb1") int i, @RequestParam("nb2") int j) {
		//int i = Integer.parseInt(req.getParameter("nb1"));
		//int j = Integer.parseInt(req.getParameter("nb2"));
		int k = i +j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
		
	}
	
}
