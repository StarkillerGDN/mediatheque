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
public class Artiste implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4327977507771168508L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String image;
	@ManyToMany(mappedBy="artistes")
	@JsonBackReference
	private List<Musique>musiques;
	
	//Constructeur par défaut
	public Artiste() {
	}
	
	//Constructeur surchargé
	public Artiste(String nom, String prenom, List<Musique>musiques, String image) {
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.musiques = musiques;
	}
	
	//Getter et setter
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Musique> getMusiques() {
		return musiques;
	}

	public void setMusiques(List<Musique> musiques) {
		this.musiques = musiques;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
