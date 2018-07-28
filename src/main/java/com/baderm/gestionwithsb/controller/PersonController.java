package com.baderm.gestionwithsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baderm.gestionwithsb.data.entity.Person;
import com.baderm.gestionwithsb.data.repository.PersonRepository;




@Controller
//@RequestMapping(value="/add")
public class PersonController {

	@Autowired
	private PersonRepository pRepository;
	
	@RequestMapping(value = "/add")
	@ResponseBody
	public String addPerson(String firstName, String lastName, String age){
		String personId= "";
		
		try {
		Person p = new Person(firstName, lastName, age); 
		pRepository.save(p);
		personId = String.valueOf(p.getIdPerson());
			
		} catch (Exception e) {
			return "Error creating the user: " + e.toString();
		}
		
		return "User succesfully created with id = " + personId;
	}
}
