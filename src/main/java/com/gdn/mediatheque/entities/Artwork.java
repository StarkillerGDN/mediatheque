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
public abstract class Artwork implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3575071412652177362L;
	//Attributs
	@Id
	@GeneratedValue
	protected Long id;
	protected String title;
	protected int year;
	protected double duration;
	@Column(length=1500)
	protected String description;
	protected String image;
	@Enumerated(EnumType.STRING)
	protected Type type;

	
	//Constructeur par défaut
	public Artwork() {
	}
	
	//Constructeur surchargé
	public Artwork(String title, int year, double duration, String description, String image, Type type) {
		super();
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.description = description;
		this.image = image;
		this.type = type;

	}

	//Getter et setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuree(double duration) {
		this.duration = duration;
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

	public Type getType() {
		return type;
	}

	public void setGenre(Type type) {
		this.type = type;
	}
	
}
