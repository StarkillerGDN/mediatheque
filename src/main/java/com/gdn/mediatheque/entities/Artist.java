/**
 * 
 */
package com.gdn.mediatheque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author Geoffrey DAHURON
 *
 */
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Artist implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4327977507771168508L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String firstname;
	private String image;
	@ManyToMany(mappedBy="artists")
	@JsonBackReference
	private List<Music>musics;
	
	//Constructeur par défaut
	public Artist() {
	}
	
	//Constructeur surchargé
	public Artist(String name, String firstname, List<Music>musics, String image) {
		this.name = name;
		this.firstname = firstname;
		this.image = image;
		this.musics = musics;
	}
	
	//Getter et setter
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusiques(List<Music> musics) {
		this.musics = musics;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
