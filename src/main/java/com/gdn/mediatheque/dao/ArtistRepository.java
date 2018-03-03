/**
 * 
 */
package com.gdn.mediatheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdn.mediatheque.entities.Artist;

/**
 * @author Geoffrey DAHURON
 *
 */
public interface ArtistRepository extends JpaRepository<Artist, Long>{

}
