package com.gyojincompany.ch1301;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IdController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/idoutput", method = RequestMethod.GET)
	public String idoutput(@RequestParam("id") String id, Model model) {
		
		System.out.println("GET 방식 실행됨!");
		model.addAttribute("id", id);
		
		return "idoutput";
	}
	
	@RequestMapping(value = "/idoutput", method = RequestMethod.POST)
	public String idoutput(HttpServletRequest request, Model model) {
		
		System.out.println("POST 방식 실행됨!");
		String id = request.getParameter("id");
		model.addAttribute("id", id);
		
		return "idoutput";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping("/joinOk")
	public String joinOk(@ModelAttribute("sInfo") StudentInformationThird studentInfomationThird) {
		
		return "joinOk";
	}
	
	
	

}
