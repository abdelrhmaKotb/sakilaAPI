package gov.iti.jets.services;

import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.repositories.entities.Actor;
import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.actor.ActorMapper;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;


public class ActorService extends ServiceImpl<Actor,ActorDto,Integer> {

    public ActorService(){
        super(Actor.class, ActorMapper.INSTANCE);
    }

    public List<FlatFilmDto> getActorFilms(int id ){

        ActorDto actor = get(id);
            
        List<FlatFilmDto> films = new ArrayList<>();
    
        actor.getFilmActors().forEach(e -> {
            films.add(FlatFilmMapper.INSTANCE.toDto(e.getFilm()));
        });

        return films;
    }


    


    
}
