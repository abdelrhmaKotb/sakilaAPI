package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;

public class FilmService extends ServiceImpl<Film, FlatFilmDto, Integer> {
    public FilmService() {
        super(Film.class, FlatFilmMapper.INSTANCE);
    }
}
