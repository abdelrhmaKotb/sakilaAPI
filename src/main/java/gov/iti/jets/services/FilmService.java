package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.City;
import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.mappers.film.FilmMapper;

public class FilmService extends ServiceImpl<Film, FilmDto, Integer> {
    public FilmService() {
        super(Film.class, FilmMapper.INSTANCE);
    }
}
