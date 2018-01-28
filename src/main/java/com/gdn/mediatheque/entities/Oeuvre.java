/**
 * 
 */
package com.gdn.mediatheque.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Geoffrey DAHURON
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CAT_OEUVRE", discriminatorType=DiscriminatorType.STRING, length=8)
public abstract class Oeuvre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3575071412652177362L;
	//Attributs
	@Id
	@GeneratedValue
	protected Long id;
	protected String titre;
	protected int annee;
	protected double duree;
	@Column(length=1500)
	protected String description;
	protected String image;
	@Enumerated(EnumType.STRING)
	protected Genre genre;

	
	//Constructeur par défaut
	public Oeuvre() {
	}
	
	//Constructeur surchargé
	public Oeuvre(String titre, int annee, double duree, String description, String image, Genre genre) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.description = description;
		this.image = image;
		this.genre = genre;

	}

	//Getter et setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}
