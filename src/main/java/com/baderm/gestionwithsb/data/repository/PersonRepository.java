package com.baderm.gestionwithsb.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baderm.gestionwithsb.data.entity.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

	public Person findByAge(String s);
}
