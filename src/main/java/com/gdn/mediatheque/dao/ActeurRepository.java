package com.gdn.mediatheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdn.mediatheque.entities.Acteur;

/**
 * @author Geoffrey DAHURON
 *
 */

public interface ActeurRepository extends JpaRepository<Acteur, Long> {
	
}
