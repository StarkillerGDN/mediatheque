/**
 * 
 */
package com.gdn.mediatheque.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gdn.mediatheque.entities.Actor;
import com.gdn.mediatheque.entities.Artist;
import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Type;
import com.gdn.mediatheque.entities.Music;
import com.gdn.mediatheque.entities.Artwork;
import com.gdn.mediatheque.entities.Director;
import com.gdn.mediatheque.entities.Serie;
import com.gdn.mediatheque.services.IMediathequeService;

/**
 * @author Geoffrey DAHURON
 *
 */
@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class MediathequeController {
	@Autowired
	private IMediathequeService iMediathequeService;
	
	/*************Routes oeuvres *************/
	@RequestMapping(value="/artworks", method=RequestMethod.GET)
	public List<Artwork> getArtworks(){
		return iMediathequeService.getArtworks();
	}
	@RequestMapping(value="/films", method=RequestMethod.GET)
	public List<Film> getFilms(){
		return iMediathequeService.getFilms();
	}
	@RequestMapping(value="/series", method=RequestMethod.GET)
	public List<Serie> getSeries(){
		return iMediathequeService.getSeries();
	}
	
	@RequestMapping(value="/musics", method=RequestMethod.GET)
	public List<Music> getMusics(){
		return iMediathequeService.getMusics();
	}
	
	@RequestMapping(value="/artworks/{id}", method=RequestMethod.GET)
	public Artwork getArtwork(@PathVariable Long id) {
		return iMediathequeService.getArtwork(id);
	}
	
	/*************Routes Filtres oeuvres *************/
	@RequestMapping(value="/films/byDirector/{name}", method=RequestMethod.GET)
	public List<Film> findFilmByDirector(@PathVariable String name){
		return iMediathequeService.findFilmByDirector(name);
	}
	
	@RequestMapping(value="/series/byDirector/{name}", method=RequestMethod.GET)
	public List<Serie> findSerieByDirector(@PathVariable String name){
		return iMediathequeService.findSerieByDirector(name);
	}
	
	@RequestMapping(value="/films/byActor/{name}", method=RequestMethod.GET)
	public List<Film> findFilmByActor(@PathVariable String name){
		return iMediathequeService.findFilmByActor(name);
	}
	
	@RequestMapping(value="/series/byActor/{name}", method=RequestMethod.GET)
	public List<Serie> findSerieByActor(@PathVariable String name){
		return iMediathequeService.findSerieByActor(name);
	}
	
	@RequestMapping(value="/musics/byArtist/{nom}", method=RequestMethod.GET)
	public List<Music> findMusicByArtist(@PathVariable String name){
		return iMediathequeService.findMusicByArtist(name);
	}
	
	@RequestMapping(value="/artworks/byTitle/{title}", method=RequestMethod.GET)
	public List<Artwork> findByTitle(@PathVariable String title){
		return iMediathequeService.findByTitle(title);
	}
	
	@RequestMapping(value="/films/byYear/{year}", method=RequestMethod.GET)
	public List<Film> findFilmByYear(@PathVariable int year){
		return iMediathequeService.findFilmByYear(year);
	}
	
	
	@RequestMapping(value="/series/byYear/{year}", method=RequestMethod.GET)
	public List<Serie> findSerieByYear(@PathVariable int year){
		return iMediathequeService.findSerieByYear(year);
	}
	
	@RequestMapping(value="/musics/byYear/{year}", method=RequestMethod.GET)
	public List<Music> findMusicByYear(@PathVariable int year){
		return iMediathequeService.findMusicByYear(year);
	}
	
	/*@RequestMapping(value="/films/byGenre/{genre}", method=RequestMethod.GET)
	public List<Film> findFilmByGenre(@PathVariable String genre){
		return iMediathequeService.findFilmByGenre(genre);
	}
	
	
	@RequestMapping(value="/series/byGenre/{genre}", method=RequestMethod.GET)
	public List<Serie> findSerieByGenre(@PathVariable String genre){
		return iMediathequeService.findSerieByGenre(genre);
	}*/
	
	/*@RequestMapping(value="/musiques/byGenre/{genreMusique}", method=RequestMethod.GET)
	public List<Musique> findMusiqueByGenre(@PathVariable String genreMusique){
		return iMediathequeService.findMusiqueByGenre(genreMusique);
	}*/
	
	/*************Routes Realisateur*************/
	@RequestMapping(value="/directors", method=RequestMethod.GET)
	public List<Director>getDirectors(){
		return iMediathequeService.getDirectors();
	}
	
	@RequestMapping(value="/directors/{id}", method=RequestMethod.GET)
	public Director getDirector(@PathVariable Long id){
		return iMediathequeService.getDirector(id);
	}
	
	/*************Routes Acteur*************/
	@RequestMapping(value="/actors", method=RequestMethod.GET)
	public List<Actor>getActors(){
		return iMediathequeService.getActors();
	}
	
	@RequestMapping(value="/actors/{id}", method=RequestMethod.GET)
	public Actor getActor(@PathVariable Long id){
		return iMediathequeService.getActor(id);
	}
	
	/*************Routes Artiste*************/
	@RequestMapping(value="/atists", method=RequestMethod.GET)
	public List<Artist>getArtists(){
		return iMediathequeService.getArtists();
	}
	
	@RequestMapping(value="/artists/{id}", method=RequestMethod.GET)
	public Artist getArtist(@PathVariable Long id){
		return iMediathequeService.getArtist(id);
	}
	
}
