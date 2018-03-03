/**
 * 
 */
package com.gdn.mediatheque.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



/**
 * @author Geoffrey DAHURON
 *
 */
@Entity
@DiscriminatorValue("MUSIC")
public class Music extends Artwork{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8490930952545604863L;
	//Attibuts
	@ManyToMany
	@JoinTable(
			name="MUSIC_ARTISTS",
			joinColumns=@JoinColumn(name="ID_MUSIC", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="ID_ARTIST", referencedColumnName="ID"))
	private List<Artist> artists;
	
	
	//Constructeur par défaut
	public Music() {
		super();
	}
	
	//Constructeur surchargé
	public Music(String title, int year, double duration, String description, String image, Type type,
			 List<Artist> artists) {
		super(title, year, duration, description, image, type);
		this.artists = artists;
	}
	
	//Getter et setter
	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	
	
}
