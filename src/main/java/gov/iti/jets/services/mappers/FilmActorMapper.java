package gov.iti.jets.services.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.FilmActor;
import gov.iti.jets.services.dto.FilmActorDto;

@Mapper
public interface FilmActorMapper extends gov.iti.jets.services.mappers.Mapper<FilmActor, FilmActorDto> {
    FilmActorMapper INSTANCE = Mappers.getMapper(FilmActorMapper.class);
   
}