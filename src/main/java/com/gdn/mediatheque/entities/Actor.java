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
public class Actor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6598105623361478386L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String firstname;
	private String image;
	@ManyToMany(mappedBy="actors")
	@JsonBackReference
	private List<Film>films;
	@ManyToMany(mappedBy="actors")
	@JsonBackReference
	private List<Serie>series;
	
	//Constructeur par défaut
	public Actor() {
	}
	
	//Constructeur surchargé
	public Actor(String name, String firstname, List<Film>films, List<Serie>series, String image) {
		this.name = name;
		this.firstname = firstname;
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
	
	public String getName() {
		return name;
	}
	
	public void setNom(String name) {
		this.name = name;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setPrenom(String firstname) {
		this.firstname = firstname;
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
