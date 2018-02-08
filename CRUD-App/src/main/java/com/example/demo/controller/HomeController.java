package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class HomeController {
	
	@Qualifier("studentservicecals")
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView index2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create");
		return mv;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Student s) {
		studentService.save(s);
		return new ModelAndView("redirect:/success");
	}
	
	@RequestMapping("/read")
	public ModelAndView read() {
		List<Student> stuList = studentService.read();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("read");
		mv.addObject("stuList", stuList);
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}
	
	@RequestMapping("/deletedata")
	public ModelAndView deleteData(@ModelAttribute Student s) {
		studentService.delete(s);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		String opr = new String("Deleted");
		mv.addObject("opr", opr);
		return mv;
	}
	
	@RequestMapping("/success")
	public ModelAndView success() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		String opr = new String("Created");
		mv.addObject("opr", opr);
		return mv;
	}
	
}