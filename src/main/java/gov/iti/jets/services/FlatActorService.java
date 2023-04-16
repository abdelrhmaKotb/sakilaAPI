package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Actor;
import gov.iti.jets.services.dto.actor.FlatActorDto;
import gov.iti.jets.services.mappers.actor.FlatActorMapper;


public class FlatActorService extends ServiceImpl<Actor,FlatActorDto,Integer> {

    public FlatActorService(){
        super(Actor.class, FlatActorMapper.INSTANCE);
    }

}
