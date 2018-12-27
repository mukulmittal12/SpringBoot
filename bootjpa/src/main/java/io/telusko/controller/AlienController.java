package io.telusko.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import io.telusko.dao.AlienRepo;
import io.telusko.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		
		System.out.println(repo.findAll());
		System.out.println(repo.findByTeam("Finance"));
		System.out.println(repo.findByAidLessThan(102));
		System.out.println(repo.findByTeamSorted("Finance"));
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {
		return repo.findAll().toString();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public String getAlienById(@PathVariable("aid") int aid) {
		return repo.findById(aid).orElse(null).toString();
	}
}
