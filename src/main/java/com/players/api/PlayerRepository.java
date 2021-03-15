package com.players.api;

import org.springframework.data.repository.CrudRepository;

/**
 * PlayerRepository Interface that provides the mechanism for storage, retrieval, search,
 * update and delete operation on objects.
 * @author Sasikala
 *
 */

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
