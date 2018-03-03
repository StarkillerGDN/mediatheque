package com.gdn.mediatheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdn.mediatheque.entities.Actor;

/**
 * @author Geoffrey DAHURON
 *
 */

public interface ActorRepository extends JpaRepository<Actor, Long> {
	
}
