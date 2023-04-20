package gov.iti.jets.repositories;

import gov.iti.jets.repositories.entities.Film;

public class FilmRepository extends RepositoryImpl<Film,Integer>  {
    public FilmRepository(){
        super(Film.class);
    }
}
