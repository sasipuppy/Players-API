package com.players.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * PlayerService class that provides the business logic.
 * @author Sasikala
 *
 */
@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	/**
	 * Get all players.
	 * @return
	 */
	public List<Player> getAll(){
        List<Player> player = new ArrayList<>();
        playerRepository.findAll().forEach(player::add);
        return player;
    }
	
	/**
	 * Get a player by id.
	 * @param id
	 * @return
	 */
	public Player getPlayerById(long id) {
        if(playerRepository.existsById(id)){
    	return playerRepository.findById(id).get();
        }
          return null;
    }
	
	/**
	 * Add a player
	 * @param player
	 */
	public void addPlayer(Player player) {
		playerRepository.save(player);
    }
	
	/**
	 * Update a player by id.
	 * @param id
	 * @param player
	 */
	public void updatePlayer(long id,Player player) {
		if (playerRepository.existsById(id)){
            Player tempPlayer = playerRepository.findById(id).get();
        	tempPlayer.setFirstName(player.getFirstName());
        	tempPlayer.setLastName(player.getLastName());
        	tempPlayer.setAge(player.getAge());
        	tempPlayer.setGender(player.getGender());
        	tempPlayer.setJersey(player.getJersey());
        	playerRepository.save(tempPlayer);
		 }
        }
	
	/**
	 * Delete a player by id.
	 * @param id
	 */
	public void deletePlayer(long id){
        if (playerRepository.existsById(id)){
        	playerRepository.deleteById(id);
        }
	}
}

