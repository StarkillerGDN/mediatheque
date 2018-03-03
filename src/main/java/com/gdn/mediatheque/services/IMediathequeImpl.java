/**
 * 
 */
package com.gdn.mediatheque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gdn.mediatheque.dao.ActorRepository;
import com.gdn.mediatheque.dao.ArtistRepository;
import com.gdn.mediatheque.dao.ArtworkRepository;
import com.gdn.mediatheque.dao.DirectorRepository;
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
@Service
@Transactional
public class IMediathequeImpl implements IMediathequeService {
	
	@Autowired
	private ArtworkRepository artworkRepository;
	@Autowired
	private DirectorRepository directorRepository;
	@Autowired
	private ActorRepository actorRepository;
	@Autowired 
	private ArtistRepository artistRepository;

	@Override
	public List<Artwork> getArtworks() {
		return artworkRepository.findAll();
	}

	@Override
	public List<Film> getFilms() {
		return artworkRepository.getFilms();
	}

	@Override
	public List<Serie> getSeries() {
		return artworkRepository.getSeries();
	}

	@Override
	public List<Music> getMusics() {
		return artworkRepository.getMusics();
	}

	@Override
	public Artwork getArtwork(Long id) {
		return artworkRepository.findOne(id);
	}

	@Override
	public List<Artwork> findByTitle(String title) {
		return artworkRepository.findByTitle(title);
	}
	
	@Override
	public List<Film> findFilmByYear(int year){
		return artworkRepository.findFilmByYear(year);
	}
	
	@Override
	public List<Serie> findSerieByYear(int year){
		return artworkRepository.findSerieByYear(year);
	}
	
	@Override
	public List<Music> findMusicByYear(int year){
		return artworkRepository.findMusicByYear(year);
	}

	/*@Override
	public List<Film> findFilmByGenre(String genre){
		return oeuvreRepository.findFilmByGenre(genre);
	}
	
	@Override
	public List<Serie> findSerieByGenre(String genre){
		return oeuvreRepository.findSerieByGenre(genre);
	}
	
	@Override
	public List<Musique> findMusiqueByGenre(String genreMusique){
		return oeuvreRepository.findMusiqueByGenre(genreMusique);
	} */

	@Override
	public List<Film> findFilmByDirector(String name) {
		return artworkRepository.findFilmByDirector(name);
	}

	@Override
	public List<Serie> findSerieByDirector(String name) {
		return artworkRepository.findSerieByRealisateur(name);
	}

	@Override
	public List<Music> findMusicByArtist(String name) {
		return artworkRepository.findMusiqueByArtist(name);
	}

	@Override
	public List<Film> findFilmByActor(String name) {
		return artworkRepository.findFilmByActor(name);
	}

	@Override
	public List<Serie> findSerieByActor(String name) {
		return artworkRepository.findSerieByActor(name);
	}

	@Override
	public List<Director> getDirectors() {
		return directorRepository.findAll();
	}

	@Override
	public Director getDirector(Long id) {
		return directorRepository.findOne(id);
	}

	@Override
	public List<Artist> getArtists() {
		return artistRepository.findAll();
	}

	@Override
	public Artist getArtist(Long id) {
		return artistRepository.findOne(id);
	}

	@Override
	public List<Actor> getActors() {
		return actorRepository.findAll();
	}

	@Override
	public Actor getActor(Long id) {
		return actorRepository.findOne(id);
	}

}
