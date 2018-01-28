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
public class Serie extends Oeuvre{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7573280338669068209L;
	//Attributs
	@ManyToOne
	@JoinColumn(name="ID_REALISATEUR")
	@JsonManagedReference
	private Realisateur realisateur;
	@ManyToMany
	@JoinTable(
			name="SERIE_ACTEURS",
			joinColumns=@JoinColumn(name="ID_SERIE", referencedColumnName="ID"),
			inverseJoinColumns=@JoinColumn(name="ID_ACTEUR", referencedColumnName="ID"))
	//@JsonManagedReference
	private List<Acteur> acteurs;
	
	//Constructeur par défaut
	public Serie() {
		super();
	}
	
	//Constructeur surchargé
	public Serie(String titre, int annee, double duree, String description, String image, Genre genre,
			 Realisateur realisateur, List<Acteur> acteurs) {
		super(titre, annee, duree, description, image, genre);
		this.realisateur = realisateur;
		this.acteurs = acteurs;
	}
	
	//Getter et setter
	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public List<Acteur> getActeur() {
		return acteurs;
	}

	public void setActeur(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}	
	
}
