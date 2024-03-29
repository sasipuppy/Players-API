package com.players.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * PlayerController class that invokes the business logic and controls the data flow.
 * @author Sasikala
 *
 */
@RestController
public class PlayerController {
	
	
	@Autowired
	 private PlayerService playerService;
	 
	/**
	 * Get all players.
	 * @return list of all the players 
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/player")
	    public List<Player> findAll(){
	        return playerService.getAll();
	    }
	 
	/**
	 * Get a single player based on id.
	 * @param id Id of the player to be found
	 * @return single player record with specific id
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/player/{id}")
	    public Player getPlayerById(@PathVariable long id){
	        Player player = playerService.getPlayerById(id);
	        if (player != null){
	         return playerService.getPlayerById(id);
	        }
	        else
	         return null;
	     }
	 

	/**
	 * Add a player.
	 * @param player Player object with details of the player to be added
	 * @return message indicating player addition.
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/player")
	    public String addPlayer(@RequestBody Player player){
		  List<Player> tempPlayer = new ArrayList<>();
		  tempPlayer= playerService.getAll();
	        if (tempPlayer != null){
	        	for(Player p : tempPlayer)
	        	{
	        	  if((p.getJersey())==(player.getJersey()))	
	        	    {
	        		  return "Error! Jersey number already exists!";
	        		  
	        		}
	        	  else
	        		  continue;
	        	}
	        	
	        	 playerService.addPlayer(player);
        		 return "Player added!";
	         }
	        return null;
	    } 
	  
	/**
	 * Update player details based on id.
	 * @param id Id of the player to be updated
	 * @param player Player object with details of the player to be updated
	 * @return message indicating player update.
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/player/{id}")
	    public String updatePlayer(@PathVariable long id,@RequestBody Player player) {
	        
	        Player newPlayer = playerService.getPlayerById(id);
	        if (newPlayer != null){
	        	playerService.updatePlayer(id,player);
	        return "Player updated!";
	        }
	        return "Player does not exist!";
	    }
	  
	/**
	 * Delete a player based on id.
	 * @param id Id of the player to be deleted
	 * @return message indicating player deletion.
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/player/{id}")
	    public String deletePerson(@PathVariable long id){
	        Player player = playerService.getPlayerById(id);
	        if (player != null){
	            playerService.deletePlayer(id);
	        return "Player deleted!";
	        }
	        return "Player does not exist!";
	    }
	 
}
