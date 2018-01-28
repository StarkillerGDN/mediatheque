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
public class Realisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4004593202958017869L;
	//Attributs
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	@OneToMany(mappedBy="realisateur")
	@JsonBackReference
	private List<Film>films;
	@OneToMany(mappedBy="realisateur")
	@JsonBackReference
	private List<Serie>series;
	
	//Constructeur par défaut
	public Realisateur() {
	}
	
	//Constructeur surchargé
	public Realisateur(String nom, String prenom, List<Film>films, List<Serie>series) {
		this.nom = nom;
		this.prenom = prenom;
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
	
	
	
	
	
	
}
