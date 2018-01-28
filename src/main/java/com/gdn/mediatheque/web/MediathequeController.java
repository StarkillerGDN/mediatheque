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

import com.gdn.mediatheque.entities.Acteur;
import com.gdn.mediatheque.entities.Artiste;
import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Genre;
import com.gdn.mediatheque.entities.Musique;
import com.gdn.mediatheque.entities.Oeuvre;
import com.gdn.mediatheque.entities.Realisateur;
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
	@RequestMapping(value="/oeuvres", method=RequestMethod.GET)
	public List<Oeuvre> getOeuvres(){
		return iMediathequeService.getOeuvres();
	}
	@RequestMapping(value="/films", method=RequestMethod.GET)
	public List<Film> getFilms(){
		return iMediathequeService.getFilms();
	}
	@RequestMapping(value="/series", method=RequestMethod.GET)
	public List<Serie> getSeries(){
		return iMediathequeService.getSeries();
	}
	
	@RequestMapping(value="/musiques", method=RequestMethod.GET)
	public List<Musique> getMusiques(){
		return iMediathequeService.getMusiques();
	}
	
	@RequestMapping(value="/oeuvres/{id}", method=RequestMethod.GET)
	public Oeuvre getOeuvre(@PathVariable Long id) {
		return iMediathequeService.getOeuvre(id);
	}
	
	/*************Routes Filtres oeuvres *************/
	@RequestMapping(value="/films/byRealisateur/{nom}", method=RequestMethod.GET)
	public List<Film> findFilmByRealisateur(@PathVariable String nom){
		return iMediathequeService.findFilmByRealisateur(nom);
	}
	
	@RequestMapping(value="/series/byRealisateur/{nom}", method=RequestMethod.GET)
	public List<Serie> findSerieByRealisateur(@PathVariable String nom){
		return iMediathequeService.findSerieByRealisateur(nom);
	}
	
	@RequestMapping(value="/films/byActeur/{nom}", method=RequestMethod.GET)
	public List<Film> findFilmByActeur(@PathVariable String nom){
		return iMediathequeService.findFilmByActeur(nom);
	}
	
	@RequestMapping(value="/series/byActeur/{nom}", method=RequestMethod.GET)
	public List<Serie> findSerieByActeur(@PathVariable String nom){
		return iMediathequeService.findSerieByActeur(nom);
	}
	
	@RequestMapping(value="/musiques/byArtiste/{nom}", method=RequestMethod.GET)
	public List<Musique> findMusiqueByArtiste(@PathVariable String nom){
		return iMediathequeService.findMusiqueByArtiste(nom);
	}
	
	@RequestMapping(value="/oeuvres/byTitre/{titre}", method=RequestMethod.GET)
	public List<Oeuvre> findByTitre(@PathVariable String titre){
		return iMediathequeService.findByTitre(titre);
	}
	
	@RequestMapping(value="/films/byAnnee/{annee}", method=RequestMethod.GET)
	public List<Film> findFilmByAnnee(@PathVariable int annee){
		return iMediathequeService.findFilmByAnnee(annee);
	}
	
	
	@RequestMapping(value="/series/byAnnee/{annee}", method=RequestMethod.GET)
	public List<Serie> findSerieByAnnee(@PathVariable int annee){
		return iMediathequeService.findSerieByAnnee(annee);
	}
	
	@RequestMapping(value="/musiques/byAnnee/{annee}", method=RequestMethod.GET)
	public List<Musique> findMusiqueByAnnee(@PathVariable int annee){
		return iMediathequeService.findMusiqueByAnnee(annee);
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
	@RequestMapping(value="/realisateurs", method=RequestMethod.GET)
	public List<Realisateur>getRealisateurs(){
		return iMediathequeService.getRealisateurs();
	}
	
	@RequestMapping(value="/realisateurs/{id}", method=RequestMethod.GET)
	public Realisateur getRealisateurs(@PathVariable Long id){
		return iMediathequeService.getRealisateur(id);
	}
	
	/*************Routes Acteur*************/
	@RequestMapping(value="/acteurs", method=RequestMethod.GET)
	public List<Acteur>getActeurs(){
		return iMediathequeService.getActeurs();
	}
	
	@RequestMapping(value="/acteurs/{id}", method=RequestMethod.GET)
	public Acteur getActeur(@PathVariable Long id){
		return iMediathequeService.getActeur(id);
	}
	
	/*************Routes Artiste*************/
	@RequestMapping(value="/artistes", method=RequestMethod.GET)
	public List<Artiste>getArtistes(){
		return iMediathequeService.getArtistes();
	}
	
	@RequestMapping(value="/artistes/{id}", method=RequestMethod.GET)
	public Artiste getArtiste(@PathVariable Long id){
		return iMediathequeService.getArtiste(id);
	}
	
}
