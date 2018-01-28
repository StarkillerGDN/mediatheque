package com.gdn.mediatheque;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class MediathequeApplication implements CommandLineRunner {
	@Autowired
	private OeuvreRepository oeuvreRepository;
	@Autowired
	private ArtisteRepository artisteRepository;
	@Autowired
	private RealisateurRepository realisateurRepository;
	@Autowired
	private ActeurRepository acteurRepository;
	
	private List<Acteur> listActeur = new ArrayList<>();
	private List<Artiste> listArtiste = new ArrayList<>();
	

	public static void main(String[] args) {
		SpringApplication.run(MediathequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Réalisateurs
		Realisateur r1 = realisateurRepository.save(new Realisateur("LUCAS", "Georges", null, null));
		Realisateur r2 = realisateurRepository.save(new Realisateur("EASTWOOD", "Clint", null, null));
		Realisateur r3 = realisateurRepository.save(new Realisateur("WACHOWSKI", "Lana", null, null));
		
		//Acteurs
		Acteur a1 = acteurRepository.save(new Acteur("HAMILL", "Mark", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Mark_Hamill_%282017%29.jpg/1200px-Mark_Hamill_%282017%29.jpg"));
		Acteur a2 = acteurRepository.save(new Acteur("FISHER", "Carrie", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Carrie_Fisher_2013.jpg/1200px-Carrie_Fisher_2013.jpg"));
		Acteur a3 = acteurRepository.save(new Acteur("FORD", "Harisson", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Harrison_Ford_Cannes.jpg/180px-Harrison_Ford_Cannes.jpg"));
		Acteur a4 = acteurRepository.save(new Acteur("VANG", "Bee", null, null, "http://www.asiancinevision.org/wp-content/uploads/2013/07/bee_vang.png"));
		Acteur a5 = acteurRepository.save(new Acteur("HER", "Ahney", null, null, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkwNjQyNTMwMF5BMl5BanBnXkFtZTcwNTk3MjYxMg@@._V1_UX214_CR0,0,214,317_AL_.jpg"));
		
		//Artiste 
		Artiste ar1 = artisteRepository.save(new Artiste("GARRIX", "Martin", null, "https://geo-media.beatport.com/image/e84a4cd1-a6ab-4381-996a-942cc48911b1.jpg"));
		Artiste ar2 = artisteRepository.save(new Artiste("GUETTA", "David", null, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/David_Guetta_2013-04-12_001.jpg/1200px-David_Guetta_2013-04-12_001.jpg"));
		
		listArtiste.add(ar1);
		
		listActeur.add(a1);
		listActeur.add(a2);
		listActeur.add(a3);
		
		//Films
		Oeuvre f1 = oeuvreRepository.save(new Film("Star Wars : Un nouvel espoir", 1977, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://is2.mzstatic.com/image/thumb/Video6/v4/58/95/f4/5895f40b-de47-c7c4-ad86-3e229c09ca95/source/1200x630bb.jpg	", Genre.ACTION, r1, listActeur));
		Oeuvre f2 = oeuvreRepository.save(new Film("Star Wars : L'empire contre attaque", 1980, 125, "Il y a bien longtemps dans une galaxy lointaine, très lointaine",
				"https://imgc.allpostersimages.com/img/print/affiches/trilogie-star-wars-l-empire-contre-attaque_a-G-2549061-0.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f3 =oeuvreRepository.save(new Film("Avengers : Infinity War", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://www.unificationfrance.com/IMG/jpg/avengers_infinity_war_un_film_de_braquage_selon_les_freres_russo.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f4 =oeuvreRepository.save(new Film("A Star Wars Story : Han Solo", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"https://i.pinimg.com/736x/d7/f8/e6/d7f8e65d85a6357e41a7f42ab45e04bb--solo-solo-han-solo.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f5 =oeuvreRepository.save(new Film("Fast And Furious 9", 2018, 125, "Vin Diesel porte le nom d'un moteur !!!",
				"http://www.movienewz.com/wp-content/uploads/2017/04/fast-and-the-furious-9-poster.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f6 =oeuvreRepository.save(new Film("James Bond", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://vowbridal.co.uk/wp-content/uploads/2015/10/Vow-BridaL-Gallery-Peterborough-The-White-Tuxedo-is-Back.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f7 =oeuvreRepository.save(new Film("Alien : Le retour", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://fr.web.img3.acsta.net/pictures/17/06/29/12/09/200767.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f8 =oeuvreRepository.save(new Film("Fast And Furious 1", 2001, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"https://static.rogerebert.com/uploads/movie/movie_poster/the-fast-and-the-furious-2001/large_3cucyEuLOOjjJ8nem5facsTEy68.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre f9 =oeuvreRepository.save(new Film("Star wars : The Clone Wars", 2008, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://www.nonsolocinema.com/wp/wp-content/uploads/2008/09/arton12611.jpg", Genre.ANNIMATION, r1, listActeur));
		
		
		//Series
		Oeuvre s1 =oeuvreRepository.save(new Serie("Rick et Morty", 2018, 500, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam",
				"https://media.senscritique.com/media/000009446091/source_big/Rick_et_Morty.png", Genre.ANNIMATION, r1, listActeur));
		Oeuvre s2 =oeuvreRepository.save(new Serie("The End of the HUM HUM", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur",
				"http://fr.web.img3.acsta.net/pictures/17/06/29/12/09/200767.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre s3 =oeuvreRepository.save(new Serie("Fast And Furious 1", 2001, 125, "Vin Diesel porte le nom d'un moteur !!!",
				"https://static.rogerebert.com/uploads/movie/movie_poster/the-fast-and-the-furious-2001/large_3cucyEuLOOjjJ8nem5facsTEy68.jpg", Genre.ACTION, r1, listActeur));
		Oeuvre s4 =oeuvreRepository.save(new Serie("Star wars : The Clone Wars", 2008, 125, "Animation",
				"http://www.nonsolocinema.com/wp/wp-content/uploads/2008/09/arton12611.jpg", Genre.ANNIMATION, r1, listActeur));
		
		//Musiques
		Oeuvre m1 = oeuvreRepository.save(new Musique("Animals", 2013, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Genre.ELECTRO, listArtiste));
		Oeuvre m2 = oeuvreRepository.save(new Musique("Forever", 2018, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Genre.ELECTRO, listArtiste));
		Oeuvre m3 = oeuvreRepository.save(new Musique("Pizza", 2018, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Genre.ELECTRO, listArtiste));
		
		listActeur.clear();
		listActeur.add(a4);
		listActeur.add(a5);
		Oeuvre s5 = oeuvreRepository.save(new Serie("Sense8", 2016, 400, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur", "http://star24.tv/wp-content/uploads/2017/06/sense8_wallpaper_by_alexlima1095-d8xiqy9-1.png", Genre.ACTION, r3, listActeur));

		
	}
}
