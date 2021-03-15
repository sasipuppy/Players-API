package com.players.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Player class, model class that contains the data of the application.
 * This class is mapped to a database table using @Entity annotation.
 * @author Sasikala
 *
 */
@Entity
public class Player {
	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int jersey;
	
		
	/**
	 * constructor with five parameters 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 * @param jersey
	 */
	public Player(String firstName, String lastName, int age, String gender, int jersey) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.jersey = jersey;
	}

	/**
	 * Default constructor
	 */
	public Player() {
		
	}
	
	/**
	 * Getter method for id field.
	 * @return
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	/**
	 * Setter method for id field.
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * getter method for first name field.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter method for first name field.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter method for last name field.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 *Setter method for last name field.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter method for age field.
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Setter method for age field.
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Getter method for gender field.
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter method for gender field.
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Getter method for Jersey number.
	 * @return
	 */
	public int getJersey() {
		return jersey;
	}
	
	/**
	 * Setter method for Jersey number.
	 * @param jersey
	 */
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	
}
