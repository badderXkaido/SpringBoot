package com.baderm.gestionwithsb.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PERSONS")
public class Person {
	
	@Id
	@Column(name="ID_PERSON")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPerson;
	
	//@Column(name="FIRST_NAME")
	@NotNull
	private String firstName;
	
	//@Column(name="LAST_NAME")
	@NotNull
	private String lastName;
	
	//@Column(name="AGE")
	@NotNull
	private String age;
	
	
	//Constructor
	public Person(String firstName, String lastName, String age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	// Setters && Getters
	public Long getIdPerson() {
		return idPerson;
	}


	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}
	

}
