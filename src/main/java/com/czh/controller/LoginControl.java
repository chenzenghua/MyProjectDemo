package com.czh.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.czh.bean.Person;
import com.czh.service.PersonService;
 
@Controller
public class LoginControl {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/list")
	public String test(Model model){
		
		List<Person> list = personService.findAll();
		for (Person person : list) {
			System.out.println(person);
		}
		model.addAttribute("person",list);
		return "main";
	}
}
