package com.players.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit testing with Junit for players API.
 * @author Sasikala
 *
 */
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PlayerApplicationUnitTests {
	
	@Autowired
	PlayerRepository repo;

	/**
	 * Verification of expected number of rows from database table.
	 */
	@Test
	@Order(1)
	void testRowsize() {
		List<Player> players =  (List<Player>) repo.findAll();
	    assertEquals(4, players.size());
	  }
	
	/**
	 * Verification of presence of a specific row from database table.
	 */
	@Order(2)
	@Test
	void testRowExist() {
		List<Player> player = new ArrayList<>();
		repo.findAll().forEach(player::add);
		List<Player> testPlayer = new ArrayList<>();
		testPlayer.add(new Player("Juan", "Johnny",21,"Female",34));
				
		for(int i=0;i<player.size();i++) {
		if(player.get(i).getId()!=4)
			continue;
		assertTrue(player.get(i).getFirstName().equals(testPlayer.get(0).getFirstName()));
		assertTrue(player.get(i).getLastName().equals(testPlayer.get(0).getLastName()));
		assertTrue(player.get(i).getGender().equals(testPlayer.get(0).getGender()));
		assertTrue(player.get(i).getAge()==testPlayer.get(0).getAge());
		assertTrue(player.get(i).getJersey()==testPlayer.get(0).getJersey());
	  }
	}
	
	/**
	 * Verfication of total number of rows from Database table after adding player records.
	 */
	@Order(3)
	@Test
	void testCreate(){
		   List<Player> testPlayer = new ArrayList<>();
		   Player player = new Player("Sasi", "Ramu",21,"Female",39);
		   Player player1 = new Player("Ram", "Sasi",21,"Female",40);
		   repo.save(player);
		   repo.save(player1);
		   repo.findAll().forEach(testPlayer::add);
		   assertEquals(6, testPlayer.size());
		  }
	
	/**
	 * Verfication of total number of rows from Database table after deleting a player record.
	 */
	@Order(4)
	@Test
	void testDelete(){
		   List<Player> testPlayer = new ArrayList<>();
		   Player player = repo.findById((long)4).get();
		   repo.deleteById((long)1);
		   repo.findAll().forEach(testPlayer::add);
		   repo.save(player);
		   assertEquals(5, testPlayer.size());
		}
      }
