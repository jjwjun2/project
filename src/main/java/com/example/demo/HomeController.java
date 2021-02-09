package com.example.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"c"})
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	
	@GetMapping("/")
	public String home(HttpSession session, HttpServletRequest request) {
		String c = request.getContextPath();
		session.setAttribute("c", c);
		System.out.println("Check c path: "+c);
		return "home";
	}
	
	
	@GetMapping("/manage/{page}")
	public String admin(@PathVariable String page) {
		System.out.println("이동: " + page);
		return String.format("manage:%s", page);
	}


	// controller->tiles->view

	@GetMapping("/manage/{page}/{page2}")
	public String transfer(@PathVariable String page,@PathVariable String page2 ) {
		System.out.println("이동: " + page);
		// tiles의 이름
		return String.format("manage:%s/%s", page, page2);
	}
	
	@GetMapping("/manage/{page}/{page2}/{page3}")
	public String transfers(@PathVariable String page, @PathVariable String page2, 
			@PathVariable String page3) {
		System.out.println("이동: " + page);
		// tiles의 이름
		return String.format("manage:%s/%s/%s", page, page2, page3);
	}
	
}