/**
 * 
 */
package com.gdn.mediatheque.services;

import java.util.List;

import com.gdn.mediatheque.entities.Acteur;
import com.gdn.mediatheque.entities.Artiste;
import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Genre;
import com.gdn.mediatheque.entities.Musique;
import com.gdn.mediatheque.entities.Oeuvre;
import com.gdn.mediatheque.entities.Realisateur;
import com.gdn.mediatheque.entities.Serie;

/**
 * @author Geoffrey DAHURON
 *
 */
public interface IMediathequeService {
	//Lister toutes les oeuvres (films, series, musiques)
	public List<Oeuvre> getOeuvres();
	
	//Lister les films
	public List<Film> getFilms();
	
	//Lister les séries
	public List<Serie> getSeries();
	
	//Lister les musique
	public List<Musique> getMusiques();
	
	//Trouver une oeuvre par son id
	public Oeuvre getOeuvre(Long id);
	
	/***************Filtres***************/
	
	//Trouver des films par rapport à un réalisateur
	public List<Film> findFilmByRealisateur(String nom);
	
	//Trouver des serie par rapport à un réalisateur
	public List<Serie> findSerieByRealisateur(String nom);
	
	//Trouver des oeuvres par rapport à un artiste
	public List<Musique> findMusiqueByArtiste(String nom);
	
	//Trouver des oeuvres par rapport à un acteur
	public List<Film> findFilmByActeur(String nom);
	
	//Trouver des oeuvres par rapport à un acteur
	public List<Serie> findSerieByActeur(String nom);
	
	//Trouver des oeuvres par rapport à un titre
	public List<Oeuvre> findByTitre(String titre);
	
	//Trouver des films par rapport à une année
	public List<Film> findFilmByAnnee(int annee);
	
	//Trouver des series par rapport à une année
	public List<Serie> findSerieByAnnee(int annee);
	
	//Trouver des musique par rapport à une année
	public List<Musique> findMusiqueByAnnee(int annee);
	
	//Trouver des films par rapport à un genre
	//public List<Film> findFilmByGenre(String genre);
	
	//Trouver des séries par rapport à un genre
	//public List<Serie> findSerieByGenre(String genre);
	
	//Trouver des séries par rapport à un genre
	//public List<Musique> findMusiqueByGenre(String genreMusique);
	
	/***************Realisateurs, Acteurs, Artiste***************/
	
	public List<Realisateur> getRealisateurs();
	
	public Realisateur getRealisateur(Long id);
	
	public List<Artiste> getArtistes();
	
	public Artiste getArtiste(Long id);
	
	public List<Acteur> getActeurs();
	
	public Acteur getActeur(Long id);
	
	/***************Fonctions non utilisables par l'utilisateur***************/
	/*public Film saveFilm(Film f);
	public Serie saveSerie(Serie s);
	public Musique saveMusique(Musique m);
	public Realisateur saveRealisateur(Realisateur realisateur);
	public Acteur saveActeur(Acteur acteur);
	public Artiste saveArtiste(Artiste artiste);
	
	public boolean deleteOeuvre(Long id);
	public boolean deleteRealisateur(Long id);
	public boolean deleteActeur(Long id);
	public boolean deleteArtiste(Long id);
	
	public Oeuvre updateOeuvre(Long id, Oeuvre oeuvre);
	public Realisateur updateRealisteur(Long id, Realisateur realisateur);
	public Acteur updateActeur(Long id, Acteur acteur);
	public Artiste updateArtiste(Long id, Artiste artiste); */
	 

}
