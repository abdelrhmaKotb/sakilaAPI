package gov.iti.jets.services.mappers.film;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.film.FilmDto;

@Mapper
public interface FilmMapper extends gov.iti.jets.services.mappers.Mapper<Film,FilmDto>{
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    // @Mapping(target = "filmActors" ,ignore = true)
    // FilmDto toDto(Film e);

    // @Mapping(target = "filmActors" ,ignore = true)
    // Film toEntity(FilmDto e);
   

    
}
