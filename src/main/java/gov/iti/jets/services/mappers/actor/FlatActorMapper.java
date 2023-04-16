package gov.iti.jets.services.mappers.actor;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Actor;
import gov.iti.jets.services.dto.actor.FlatActorDto;

@Mapper
public interface FlatActorMapper extends gov.iti.jets.services.mappers.Mapper<Actor,FlatActorDto> {
    FlatActorMapper INSTANCE = Mappers.getMapper(FlatActorMapper.class);
    
}
