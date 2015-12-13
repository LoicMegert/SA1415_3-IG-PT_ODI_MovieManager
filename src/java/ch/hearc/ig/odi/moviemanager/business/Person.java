package ch.hearc.ig.odi.moviemanager.business;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
public class Person implements Serializable {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Map<Long, Movie> movies;
    
    /**
     * Constructeur paramétré pour la classe Person. Obligatoire. Représente
     * une personne possédant des films.
     *
     * @param id Le numéro unique d'identification de la personne
     * @param firstName Le prénom de la personne
     * @param lastName Le nom de famille de la personne
     */
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        movies = new HashMap();
    }
    
    /**
     * Retourne le film correspondant au numéro unique d'identification passé en
     * paramètre, ou null si aucun film ne correspond.
     *
     * @param id Le numéro unique d'identification du film à rechercher
     * @return Le film recherché, ou null si aucun film ne correspond
     */
    public Movie getMovieByNumber(Long id) {
        return movies.get(id);
    }

    /**
     * Méthode qui ajoute un film à la personne
     *
     * @param mov Le film à ajouter
     */
    public void addMovie(Movie mov) {
        this.movies.put(mov.getId(), mov);
        mov.addPerson(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

}
