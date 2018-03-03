/**
 * 
 */
package com.gdn.mediatheque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gdn.mediatheque.entities.Film;
import com.gdn.mediatheque.entities.Type;
import com.gdn.mediatheque.entities.Music;
import com.gdn.mediatheque.entities.Artwork;
import com.gdn.mediatheque.entities.Serie;

/**
 * @author Geoffrey DAHURON
 *
 */
public interface ArtworkRepository extends JpaRepository<Artwork, Long>{
	@Query("select f from Film f")
	public List<Film> getFilms();
	
	@Query("select s from Serie s")
	public List<Serie> getSeries();
	
	@Query("select m from Music m")
	public List<Music>getMusics();
	
	@Query("select f from Film f where f.director.name=:name or f.director.firstname=:name")
	public List<Film> findFilmByDirector(@Param("name")String name);
	
	@Query("select s from Serie s where s.director.name=:name or s.director.firstname=:name")
	public List<Serie> findSerieByRealisateur(@Param("name")String name);
	
	@Query("select m from Music m join m.artists a where a.name=:name")
	public List<Music> findMusiqueByArtist(@Param("name")String name);
	
	@Query("select f from Film f join f.actors a where a.name like :name%")
	public List<Film> findFilmByActor(@Param("name")String name );
	
	@Query("select s from Serie s join s.actors a where a.name=:name")
	public List<Serie> findSerieByActor(@Param("name")String name);
	
	@Query("select o from Artwork o where o.title like :title%")
	public List<Artwork>findByTitle(@Param("title")String title);
	
	@Query("select f from Film f where f.year=:year")
	public List<Film> findFilmByYear(@Param("year")int year);
	
	@Query("select s from Serie s where s.year=:year")
	public List<Serie> findSerieByYear(@Param("year")int year);
	
	@Query("select m from Music m where m.year=:year")
	public List<Music> findMusicByYear(@Param("year")int year);
	
	/*@Query("select f from Film f where f.genre.name()")
	public List<Film> findFilmByGenre(@Param("genre")String genre);
	
	@Query("select s from Serie s where s.genre=:genre")
	public List<Serie> findSerieByGenre(@Param("genre")String genre);
	
	@Query("select m from Musique m where m.genre=:genreMusique")
	public List<Musique> findMusiqueByGenre(@Param("genreMusique")String genreMusique); */
}
 