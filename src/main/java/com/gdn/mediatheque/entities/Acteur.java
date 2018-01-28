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
public class Acteur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6598105623361478386L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String image;
	@ManyToMany(mappedBy="acteurs")
	@JsonBackReference
	private List<Film>films;
	@ManyToMany(mappedBy="acteurs")
	@JsonBackReference
	private List<Serie>series;
	
	//Constructeur par défaut
	public Acteur() {
	}
	
	//Constructeur surchargé
	public Acteur(String nom, String prenom, List<Film>films, List<Serie>series, String image) {
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.films = films;
		this.series = series;
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

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
