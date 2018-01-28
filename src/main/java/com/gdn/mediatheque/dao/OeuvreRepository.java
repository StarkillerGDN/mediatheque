/**
 * 
 */
package com.gdn.mediatheque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Genre;
import com.gdn.mediatheque.entities.Musique;
import com.gdn.mediatheque.entities.Oeuvre;
import com.gdn.mediatheque.entities.Serie;

/**
 * @author Geoffrey DAHURON
 *
 */
public interface OeuvreRepository extends JpaRepository<Oeuvre, Long>{
	@Query("select f from Film f")
	public List<Film> getFilms();
	
	@Query("select s from Serie s")
	public List<Serie> getSeries();
	
	@Query("select m from Musique m")
	public List<Musique>getMusiques();
	
	@Query("select f from Film f where f.realisateur.nom=:nom or f.realisateur.prenom=:nom")
	public List<Film> findFilmByRealisateur(@Param("nom")String nom);
	
	@Query("select s from Serie s where s.realisateur.nom=:nom or s.realisateur.prenom=:nom")
	public List<Serie> findSerieByRealisateur(@Param("nom")String nom);
	
	@Query("select m from Musique m join m.artistes a where a.nom=:nom")
	public List<Musique> findMusiqueByArtiste(@Param("nom")String nom);
	
	@Query("select f from Film f join f.acteurs a where a.nom like :nom%")
	public List<Film> findFilmByActeur(@Param("nom")String nom);
	
	@Query("select s from Serie s join s.acteurs a where a.nom=:nom")
	public List<Serie> findSerieByActeur(@Param("nom")String nom);
	
	@Query("select o from Oeuvre o where o.titre like :titre%")
	public List<Oeuvre>findByTitre(@Param("titre")String titre);
	
	@Query("select f from Film f where f.annee=:annee")
	public List<Film> findFilmByAnnee(@Param("annee")int annee);
	
	@Query("select s from Serie s where s.annee=:annee")
	public List<Serie> findSerieByAnnee(@Param("annee")int annee);
	
	@Query("select m from Musique m where m.annee=:annee")
	public List<Musique> findMusiqueByAnnee(@Param("annee")int annee);
	
	/*@Query("select f from Film f where f.genre.name()")
	public List<Film> findFilmByGenre(@Param("genre")String genre);
	
	@Query("select s from Serie s where s.genre=:genre")
	public List<Serie> findSerieByGenre(@Param("genre")String genre);
	
	@Query("select m from Musique m where m.genre=:genreMusique")
	public List<Musique> findMusiqueByGenre(@Param("genreMusique")String genreMusique); */
}
 