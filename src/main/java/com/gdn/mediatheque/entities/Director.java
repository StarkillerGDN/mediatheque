/**
 * 
 */
package com.gdn.mediatheque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * @author Geoffrey DAHURON
 *
 */
@Entity
public class Director implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4004593202958017869L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String firstname;
	@OneToMany(mappedBy="director")
	@JsonBackReference
	private List<Film>films;
	@OneToMany(mappedBy="director")
	@JsonBackReference
	private List<Serie>series;
	
	//Constructeur par défaut
	public Director() {
	}
	
	//Constructeur surchargé
	public Director(String name, String firstname, List<Film>films, List<Serie>series) {
		this.name = name;
		this.firstname = firstname;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
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
	
	
	
	
	
	
}
