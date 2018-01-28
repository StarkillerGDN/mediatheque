/**
 * 
 */
package com.gdn.mediatheque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gdn.mediatheque.dao.ActeurRepository;
import com.gdn.mediatheque.dao.ArtisteRepository;
import com.gdn.mediatheque.dao.OeuvreRepository;
import com.gdn.mediatheque.dao.RealisateurRepository;
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
@Service
@Transactional
public class IMediathequeImpl implements IMediathequeService {
	
	@Autowired
	private OeuvreRepository oeuvreRepository;
	@Autowired
	private RealisateurRepository realisateurRepository;
	@Autowired
	private ActeurRepository acteurRepository;
	@Autowired 
	private ArtisteRepository artisteRepository;

	@Override
	public List<Oeuvre> getOeuvres() {
		return oeuvreRepository.findAll();
	}

	@Override
	public List<Film> getFilms() {
		return oeuvreRepository.getFilms();
	}

	@Override
	public List<Serie> getSeries() {
		return oeuvreRepository.getSeries();
	}

	@Override
	public List<Musique> getMusiques() {
		return oeuvreRepository.getMusiques();
	}

	@Override
	public Oeuvre getOeuvre(Long id) {
		return oeuvreRepository.findOne(id);
	}

	@Override
	public List<Oeuvre> findByTitre(String titre) {
		return oeuvreRepository.findByTitre(titre);
	}
	
	@Override
	public List<Film> findFilmByAnnee(int annee){
		return oeuvreRepository.findFilmByAnnee(annee);
	}
	
	@Override
	public List<Serie> findSerieByAnnee(int annee){
		return oeuvreRepository.findSerieByAnnee(annee);
	}
	
	@Override
	public List<Musique> findMusiqueByAnnee(int annee){
		return oeuvreRepository.findMusiqueByAnnee(annee);
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
	public List<Film> findFilmByRealisateur(String nom) {
		return oeuvreRepository.findFilmByRealisateur(nom);
	}

	@Override
	public List<Serie> findSerieByRealisateur(String nom) {
		return oeuvreRepository.findSerieByRealisateur(nom);
	}

	@Override
	public List<Musique> findMusiqueByArtiste(String nom) {
		return oeuvreRepository.findMusiqueByArtiste(nom);
	}

	@Override
	public List<Film> findFilmByActeur(String nom) {
		return oeuvreRepository.findFilmByActeur(nom);
	}

	@Override
	public List<Serie> findSerieByActeur(String nom) {
		return oeuvreRepository.findSerieByActeur(nom);
	}

	@Override
	public List<Realisateur> getRealisateurs() {
		return realisateurRepository.findAll();
	}

	@Override
	public Realisateur getRealisateur(Long id) {
		return realisateurRepository.findOne(id);
	}

	@Override
	public List<Artiste> getArtistes() {
		return artisteRepository.findAll();
	}

	@Override
	public Artiste getArtiste(Long id) {
		return artisteRepository.findOne(id);
	}

	@Override
	public List<Acteur> getActeurs() {
		return acteurRepository.findAll();
	}

	@Override
	public Acteur getActeur(Long id) {
		return acteurRepository.findOne(id);
	}

}
