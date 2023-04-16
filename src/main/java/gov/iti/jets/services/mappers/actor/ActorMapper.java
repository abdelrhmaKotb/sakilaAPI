package gov.iti.jets.services.mappers.actor;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Actor;
import gov.iti.jets.services.dto.actor.ActorDto;

@Mapper
public interface ActorMapper extends gov.iti.jets.services.mappers.Mapper<Actor,ActorDto>{
    ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);

}
