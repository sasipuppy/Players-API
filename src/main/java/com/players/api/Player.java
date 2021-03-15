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
	 * player constructor with five parameters 
	 * @param firstName first name of the player
	 * @param lastName  last name of the player
	 * @param age age of the player
	 * @param gender gender of the player
	 * @param jersey jersey number of the player
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
	 * Default player constructor
	 */
	public Player() {
		
	}
	
	/**
	 * Getter method for id field.
	 * @return id 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	/**
	 * Setter method for id field.
	 * @param id player object id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * getter method for first name field.
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter method for first name field.
	 * @param firstName first name of the player
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter method for last name field.
	 * @return lastName last name of the player.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 *Setter method for last name field.
	 * @param lastName last name of the player.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter method for age field.
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Setter method for age field.
	 * @param age age of the player.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Getter method for gender field.
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter method for gender field.
	 * @param gender gender of the player.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Getter method for Jersey number.
	 * @return jersey
	 */
	public int getJersey() {
		return jersey;
	}
	
	/**
	 * Setter method for Jersey number.
	 * @param jersey jersey number of the player.
	 */
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	
}
