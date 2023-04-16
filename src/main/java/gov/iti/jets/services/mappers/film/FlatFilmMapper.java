package gov.iti.jets.services.mappers.film;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;

@Mapper
public interface FlatFilmMapper extends gov.iti.jets.services.mappers.Mapper<Film,FlatFilmDto>{
    FlatFilmMapper INSTANCE = Mappers.getMapper(FlatFilmMapper.class);

    
   

    
}
