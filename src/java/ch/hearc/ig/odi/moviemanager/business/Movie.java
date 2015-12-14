package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
public class Movie implements Serializable {

    private Long id;
    private String name;
    private String producer;
    private Map<Long, Person> people;

    /**
     * Constructeur paramétré de la classe Movie. Toutes les valeurs sont
     * obligatoires
     *
     * @param id Le numéro unique d'identification du film
     * @param name Le nom du film
     * @param producer Le producteur du film
     */
    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.people = new HashMap();;
    }
    
    /**
     * Retourne la personne correspondant au numéro unique d'identification passé 
     * en paramètre, ou null si aucun film ne correspond.
     *
     * @param id Le numéro unique d'identification de la personne à rechercher
     * @return La personne recherchée, ou null si aucun film ne correspond
     */
    public Person getPersonByNumber(Long id) {
        return people.get(id);
    }

    /**
     * Méthode qui ajoute une personne comme possesseur de ce film
     *
     * @param pers La personne à ajouter
     */
    public void addPerson(Person pers) throws UniqueException {
        if (this.people.get(pers.getId()) != null) {
            throw new UniqueException("Error, movie has already been seen by this person");
        }
        this.people.put(pers.getId(), pers);
        //pers.addMovie(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }

}
