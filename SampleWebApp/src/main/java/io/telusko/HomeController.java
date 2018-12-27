package io.telusko;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//Using object(Alien) as variable
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
	
	/*
	 * Using different variables in ModelAndView
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName, String lname) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.addObject("lname", lname);
		mv.setViewName("home");
		
		return mv;
	}
	*/
	
	/*
	 * Using Session
	@RequestMapping("home")
	public String home(@RequestParam("name") String myName, HttpSession session) {
		System.out.println("hi " + myName);
		session.setAttribute("name", myName);
		return "home";
	}
	*/
	
	/*
	 * Using Servlet and Session objects
	 */
}
