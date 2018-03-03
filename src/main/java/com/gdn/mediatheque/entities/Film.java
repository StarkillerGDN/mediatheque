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
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author Geoffrey DAHURON
 *
 */
@Entity
@DiscriminatorValue("FILM")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Film extends Artwork {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3772399342134320666L;
	//Attributs
	@ManyToOne
	@JoinColumn(name="ID_DIRECTOR")
	@JsonManagedReference
	private Director director;
	@ManyToMany
	@JoinTable(
			name="FILM_ACTORS",
			joinColumns=@JoinColumn(name="ID_FILM", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="ID_ACTOR", referencedColumnName="ID"))
	private List<Actor> actors;
	
	
	//Constructeur par défaut
	public Film() {
		super();
	}
	
	//Constructeur surchargé
	public Film(String title, int year, double duration, String description, String image, Type type,
			 Director director, List<Actor> actors) {
		super(title, year, duration, description, image, type);
		this.actors = actors;
		this.director = director;
	}
	
	//Getter et setter
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Type getGenre() {
		return type;
	}

	public void setGenre(Type type) {
		this.type = type;
	}
	
	
	
	
}
