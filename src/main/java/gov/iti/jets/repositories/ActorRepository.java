package gov.iti.jets.repositories;

import gov.iti.jets.repositories.entities.Actor;

public class ActorRepository extends RepositoryImpl<Actor,Integer>  {
    public ActorRepository(){
        super(Actor.class);
    }
}
