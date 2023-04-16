package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.ActorService;
import gov.iti.jets.services.FlatActorService;
import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.actor.FlatActorDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Actor service 
 * endpoint /ws/Actor
 */

@WebService
public class Actor {
    private FlatActorService flatService = new FlatActorService();
    private ActorService actorService = new ActorService();

    /**
     * this method to get list of actors from database
     * 
     * @return
     * @throws Exception
     */
    @WebResult(name = "actor")
    public List<FlatActorDto> getAllActors() throws Exception {

        return flatService.get();
    }

    /**
     * @param int id
     * @return FlatActorDto
     * @throws Exception
     */
    public FlatActorDto getActor(@WebParam(name = "actorId") int id) throws Exception {
        return flatService.get(id);
    }

     /**
     * @param int id
     * @return ActorDto
     * @throws Exception
     */
    @WebResult(name = "film")
    public List<FlatFilmDto> getActorFilms(@WebParam(name = "actorId") int id) throws Exception {
        return actorService.getActorFilms(id) ;
    }

    /**
     * this method to add actor in database
     * 
     * @param actor
     * @return actor
     * @throws ValidationException
     */

    public FlatActorDto createActor(@WebParam(name = "actor") FlatActorDto actorDto)
            throws ValidationException, Exception {
        actorDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return flatService.add(actorDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteActor(@WebParam(name = "actorId") int id) throws Exception {
        flatService.delete(id);
        return true;
    }

    /**
     * update actor
     * 
     * @param ActorDto
     * @return
     * @throws Exception
     */
    public FlatActorDto updateActor(@WebParam(name = "actor") FlatActorDto actorDto) throws Exception {
        actorDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return flatService.update(actorDto);
    }


}
