package gov.iti.jets.services.mappers;

import gov.iti.jets.repositories.entities.FilmActorId;
import gov.iti.jets.services.dto.FilmActorIdDto;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface FilmActorIdMapper extends gov.iti.jets.services.mappers.Mapper<FilmActorId, FilmActorIdDto> {
    FilmActorIdMapper INSTANCE = Mappers.getMapper(FilmActorIdMapper.class);
}