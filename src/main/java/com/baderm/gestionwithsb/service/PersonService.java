package com.baderm.gestionwithsb.service;

import com.baderm.gestionwithsb.data.entity.Person;
import com.baderm.gestionwithsb.data.repository.PersonRepository;

public class PersonService {
	
	private PersonRepository pRepository;

	//Constructor
	public PersonService(PersonRepository pRepository) {
		this.pRepository = pRepository;
	}
	
	// method to add a person
	//public void addPerson(Person p){
		//pRepository.save(p);
	//}
	

}
