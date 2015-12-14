package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Bean lié à la page index.xhtml, qui permet la gestion des listes de films
 * 
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
@Named(value = "moviesBean")
@RequestScoped
public class MoviesBean {
    
    private DataModel<Movie> movies;
    
    @Inject
    private Services service;
    
    /**
     * Méthode qui permet d'obtenir la liste des films
     * 
     * @return La liste des films
     */
    public DataModel<Movie> getMovies() {
        movies = new ArrayDataModel();
        movies.setWrappedData(service.getMoviesList());
        
        return movies;
    }
}