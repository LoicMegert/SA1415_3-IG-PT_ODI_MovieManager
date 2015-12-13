package ch.hearc.ig.odi.moviemanager.business;

import java.io.Serializable;

/**
 *
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
public class Movie implements Serializable {
    
    private Long id;
    private String name;
    private String producer;
    private Person person;
    
    /**
	 * Constructeur paramétré de la classe Movie. Toutes les valeurs sont obligatoires
	 * @param id Le numéro unique d'identification du film
	 * @param name Le nom du film
	 * @param producer Le producteur du film
	 * @param person La personne à qui appartient ce film.
	 */
	public Movie(Long id, String name, String producer, Person person) {
            this.id = id;
            this.name = name;
            this.producer = producer;
            this.person = person;        
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
        
}
