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
@DiscriminatorValue("MUSIQUE")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Musique extends Oeuvre{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8490930952545604863L;
	//Attibuts
	@ManyToMany
	@JoinTable(
			name="MUSIQUE_ARTISTES",
			joinColumns=@JoinColumn(name="ID_MUSIQUE", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="ID_ARTISTE", referencedColumnName="ID"))
	//@JsonManagedReference
	private List<Artiste> artistes;
	
	
	//Constructeur par défaut
	public Musique() {
		super();
	}
	
	//Constructeur surchargé
	public Musique(String titre, int annee, double duree, String description, String image, Genre genre,
			 List<Artiste> artistes) {
		super(titre, annee, duree, description, image, genre);
		this.artistes = artistes;
	}
	
	//Getter et setter
	public List<Artiste> getArtiste() {
		return artistes;
	}

	public void setArtiste(List<Artiste> artiste) {
		this.artistes = artiste;
	}
	
	
}
