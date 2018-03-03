package com.gdn.mediatheque;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class MediathequeApplication implements CommandLineRunner {
	@Autowired
	private ArtworkRepository artworkRepository;
	@Autowired
	private ArtistRepository artistRepository;
	@Autowired
	private DirectorRepository directorRepository;
	@Autowired
	private ActorRepository actorRepository;
	
	private List<Actor> listActor = new ArrayList<>();
	private List<Artist> listArtist = new ArrayList<>();
	

	public static void main(String[] args) {
		SpringApplication.run(MediathequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Réalisateurs
		Director r1 = directorRepository.save(new Director("LUCAS", "Georges", null, null));
		Director r2 = directorRepository.save(new Director("EASTWOOD", "Clint", null, null));
		Director r3 = directorRepository.save(new Director("WACHOWSKI", "Lana", null, null));
		
		//Acteurs
		Actor a1 = actorRepository.save(new Actor("HAMILL", "Mark", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Mark_Hamill_%282017%29.jpg/1200px-Mark_Hamill_%282017%29.jpg"));
		Actor a2 = actorRepository.save(new Actor("FISHER", "Carrie", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Carrie_Fisher_2013.jpg/1200px-Carrie_Fisher_2013.jpg"));
		Actor a3 = actorRepository.save(new Actor("FORD", "Harisson", null, null, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Harrison_Ford_Cannes.jpg/180px-Harrison_Ford_Cannes.jpg"));
		Actor a4 = actorRepository.save(new Actor("VANG", "Bee", null, null, "http://www.asiancinevision.org/wp-content/uploads/2013/07/bee_vang.png"));
		Actor a5 = actorRepository.save(new Actor("HER", "Ahney", null, null, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTkwNjQyNTMwMF5BMl5BanBnXkFtZTcwNTk3MjYxMg@@._V1_UX214_CR0,0,214,317_AL_.jpg"));
		
		//Artiste 
		Artist ar1 = artistRepository.save(new Artist("GARRIX", "Martin", null, "https://geo-media.beatport.com/image/e84a4cd1-a6ab-4381-996a-942cc48911b1.jpg"));
		Artist ar2 = artistRepository.save(new Artist("GUETTA", "David", null, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/David_Guetta_2013-04-12_001.jpg/1200px-David_Guetta_2013-04-12_001.jpg"));
		
		listArtist.add(ar1);
		
		listActor.add(a1);
		listActor.add(a2);
		listActor.add(a3);
		
		//Films
		Artwork f1 = artworkRepository.save(new Film("Star Wars : Un nouvel espoir", 1977, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://is2.mzstatic.com/image/thumb/Video6/v4/58/95/f4/5895f40b-de47-c7c4-ad86-3e229c09ca95/source/1200x630bb.jpg	", Type.ACTION, r1, listActor));
		Artwork f2 = artworkRepository.save(new Film("Star Wars : L'empire contre attaque", 1980, 125, "Il y a bien longtemps dans une galaxy lointaine, très lointaine",
				"https://imgc.allpostersimages.com/img/print/affiches/trilogie-star-wars-l-empire-contre-attaque_a-G-2549061-0.jpg", Type.ACTION, r1, listActor));
		Artwork f3 =artworkRepository.save(new Film("Avengers : Infinity War", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://www.unificationfrance.com/IMG/jpg/avengers_infinity_war_un_film_de_braquage_selon_les_freres_russo.jpg", Type.ACTION, r1, listActor));
		Artwork f4 =artworkRepository.save(new Film("A Star Wars Story : Han Solo", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"https://i.pinimg.com/736x/d7/f8/e6/d7f8e65d85a6357e41a7f42ab45e04bb--solo-solo-han-solo.jpg", Type.ACTION, r1, listActor));
		Artwork f5 =artworkRepository.save(new Film("Fast And Furious 9", 2018, 125, "Vin Diesel porte le nom d'un moteur !!!",
				"http://www.movienewz.com/wp-content/uploads/2017/04/fast-and-the-furious-9-poster.jpg", Type.ACTION, r1, listActor));
		Artwork f6 =artworkRepository.save(new Film("James Bond", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://vowbridal.co.uk/wp-content/uploads/2015/10/Vow-BridaL-Gallery-Peterborough-The-White-Tuxedo-is-Back.jpg", Type.ACTION, r1, listActor));
		Artwork f7 =artworkRepository.save(new Film("Alien : Le retour", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://fr.web.img3.acsta.net/pictures/17/06/29/12/09/200767.jpg", Type.ACTION, r1, listActor));
		Artwork f8 =artworkRepository.save(new Film("Fast And Furious 1", 2001, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"https://static.rogerebert.com/uploads/movie/movie_poster/the-fast-and-the-furious-2001/large_3cucyEuLOOjjJ8nem5facsTEy68.jpg", Type.ACTION, r1, listActor));
		Artwork f9 =artworkRepository.save(new Film("Star wars : The Clone Wars", 2008, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam accepimus, quos novit vita communis. Ex hoc numero nobis exempla sumenda sunt, et eorum quidem maxime qui ad sapientiam proxime accedunt.",
				"http://www.nonsolocinema.com/wp/wp-content/uploads/2008/09/arton12611.jpg", Type.ANNIMATION, r1, listActor));
		
		
		//Series
		Artwork s1 =artworkRepository.save(new Serie("Rick et Morty", 2018, 500, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur de iis amicis qui ante oculos sunt, quos vidimus aut de quibus memoriam",
				"https://media.senscritique.com/media/000009446091/source_big/Rick_et_Morty.png", Type.ANNIMATION, r1, listActor));
		Artwork s2 =artworkRepository.save(new Serie("The End of the HUM HUM", 2018, 125, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur",
				"http://fr.web.img3.acsta.net/pictures/17/06/29/12/09/200767.jpg", Type.ACTION, r1, listActor));
		Artwork s3 =artworkRepository.save(new Serie("Fast And Furious 1", 2001, 125, "Vin Diesel porte le nom d'un moteur !!!",
				"https://static.rogerebert.com/uploads/movie/movie_poster/the-fast-and-the-furious-2001/large_3cucyEuLOOjjJ8nem5facsTEy68.jpg", Type.ACTION, r1, listActor));
		Artwork s4 =artworkRepository.save(new Serie("Star wars : The Clone Wars", 2008, 125, "Animation",
				"http://www.nonsolocinema.com/wp/wp-content/uploads/2008/09/arton12611.jpg", Type.ANNIMATION, r1, listActor));
		
		//Musiques
		Artwork m1 = artworkRepository.save(new Music("Animals", 2013, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Type.ELECTRO, listArtist));
		Artwork m2 = artworkRepository.save(new Music("Forever", 2018, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Type.ELECTRO, listArtist));
		Artwork m3 = artworkRepository.save(new Music("Pizza", 2018, 2.30, "", "http://bcnbeachfestival.com/wp-content/uploads/2015/04/MGARRIX-press-2016_hr-750x1024.jpg", Type.ELECTRO, listArtist));
		
		listActor.clear();
		listActor.add(a4);
		listActor.add(a5);
		Artwork s5 = artworkRepository.save(new Serie("Sense8", 2016, 400, "Quod si rectum statuerimus vel concedere amicis, quidquid velint, vel impetrare ab iis, quidquid velimus, perfecta quidem sapientia si simus, nihil habeat res vitii; sed loquimur", "http://star24.tv/wp-content/uploads/2017/06/sense8_wallpaper_by_alexlima1095-d8xiqy9-1.png", Type.ACTION, r3, listActor));

		
	}
}
