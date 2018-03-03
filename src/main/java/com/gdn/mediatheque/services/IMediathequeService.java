/**
 * 
 */
package com.gdn.mediatheque.services;

import java.util.List;

import com.gdn.mediatheque.entities.Actor;
import com.gdn.mediatheque.entities.Artist;
import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Type;
import com.gdn.mediatheque.entities.Music;
import com.gdn.mediatheque.entities.Artwork;
import com.gdn.mediatheque.entities.Director;
import com.gdn.mediatheque.entities.Serie;

/**
 * @author Geoffrey DAHURON
 *
 */
public interface IMediathequeService {
	//Lister toutes les oeuvres (films, series, musiques)
	public List<Artwork> getArtworks();
	
	//Lister les films
	public List<Film> getFilms();
	
	//Lister les séries
	public List<Serie> getSeries();
	
	//Lister les musique
	public List<Music> getMusics();
	
	//Trouver une oeuvre par son id
	public Artwork getArtwork(Long id);
	
	/***************Filtres***************/
	
	//Trouver des films par rapport à un réalisateur
	public List<Film> findFilmByDirector(String name);
	
	//Trouver des serie par rapport à un réalisateur
	public List<Serie> findSerieByDirector(String name);
	
	//Trouver des oeuvres par rapport à un artiste
	public List<Music> findMusicByArtist(String name);
	
	//Trouver des oeuvres par rapport à un acteur
	public List<Film> findFilmByActor(String name);
	
	//Trouver des oeuvres par rapport à un acteur
	public List<Serie> findSerieByActor(String name);
	
	//Trouver des oeuvres par rapport à un titre
	public List<Artwork> findByTitle(String title);
	
	//Trouver des films par rapport à une année
	public List<Film> findFilmByYear(int year);
	
	//Trouver des series par rapport à une année
	public List<Serie> findSerieByYear(int year);
	
	//Trouver des musique par rapport à une année
	public List<Music> findMusicByYear(int year);
	
	//Trouver des films par rapport à un genre
	//public List<Film> findFilmByGenre(String genre);
	
	//Trouver des séries par rapport à un genre
	//public List<Serie> findSerieByGenre(String genre);
	
	//Trouver des séries par rapport à un genre
	//public List<Musique> findMusiqueByGenre(String genreMusique);
	
	/***************Realisateurs, Acteurs, Artiste***************/
	
	public List<Director> getDirectors();
	
	public Director getDirector(Long id);
	
	public List<Artist> getArtists();
	
	public Artist getArtist(Long id);
	
	public List<Actor> getActors();
	
	public Actor getActor(Long id);
	
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
