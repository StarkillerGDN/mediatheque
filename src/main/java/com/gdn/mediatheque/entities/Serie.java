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
@DiscriminatorValue("SERIE")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Serie extends Artwork{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7573280338669068209L;
	//Attributs
	@ManyToOne
	@JoinColumn(name="ID_DIRECTOR")
	@JsonManagedReference
	private Director director;
	@ManyToMany
	@JoinTable(
			name="SERIE_ACTORS",
			joinColumns=@JoinColumn(name="ID_SERIE", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="ID_ACTOR", referencedColumnName="ID"))
	//@JsonManagedReference
	private List<Actor> actors;
	
	//Constructeur par défaut
	public Serie() {
		super();
	}
	
	//Constructeur surchargé
	public Serie(String title, int year, double duration, String description, String image, Type type,
			 Director director, List<Actor> actors) {
		super(title, year, duration, description, image, type);
		this.director = director;
		this.actors = actors;
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
	
}
