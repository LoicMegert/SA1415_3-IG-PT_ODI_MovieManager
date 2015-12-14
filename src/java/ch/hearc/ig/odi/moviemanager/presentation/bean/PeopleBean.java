package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Bean lié à la page index.xhtml, qui permet la gestion des listes de personnes
 * 
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
@Named(value = "peopleBean")
@RequestScoped
public class PeopleBean {
    
    private DataModel<Person> people;
    
    @Inject
    private Services services;
    
    /**
     * Méthode qui permet d'obtenir la liste des personnes
     * 
     * @return La liste des personnes
     */
    public DataModel<Person> getPeople() {
        people = new ArrayDataModel();
        people.setWrappedData(services.getPeopleList());
        
        return people;
    }
}