package com.boot.demo.controller;
import com.boot.demo.model.Alien;
import com.boot.demo.dao.AlienRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;

	 @RequestMapping("/home")
		public String home() {
			return "home";
		}
	 @RequestMapping("/addAlien")
	 public String addAlien(Alien a) {
		 repo.save(a);
		 return "home";
	 }
	 @RequestMapping("/getAlien")
	 public ModelAndView getAlien(@RequestParam int aid){
		 ModelAndView mv= new ModelAndView("show");
		 Alien alien=repo.findById(aid).orElse(new Alien());
		 mv.addObject(alien);
		 return mv;
		 
	 }
	 @RequestMapping("/deleteAlien")
	 public String deleteAlien(@RequestParam int aid){
		 repo.deleteById(aid);
		 return "home";
		 
	 }
	 @RequestMapping("/updateAlien")
	 public String updateAlien(Alien a){
		 int id=a.getAid();
		 Alien alien=repo.findById(id).orElse(new Alien());
		 alien.setAid(a.getAid());
		 alien.setAname(a.getAname());
		 repo.save(alien);
		 System.out.println(alien.getAid() + " " + alien.getAname());
		 return "home";
		 
	 }
}
