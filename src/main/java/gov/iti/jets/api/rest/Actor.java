package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.ActorService;
import gov.iti.jets.services.FlatActorService;
import gov.iti.jets.services.dto.actor.FlatActorDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import jakarta.jws.WebResult;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("actors")
public class Actor {
    private FlatActorService flatService = new FlatActorService();
    private ActorService actorService = new ActorService();

    /**
     * this method to get list of actors from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatActorDto> getAllActors() throws Exception {

        return flatService.get();
    }

    /**
     * @param int id
     * @return FlatActorDto
     * @throws Exception
     */
    @GET
    @Path("{actorId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatActorDto getActor(@PathParam(value = "actorId") int id) throws Exception {
        return flatService.get(id);
    }

    /**
     * @param int id
     * @return ActorDto
     * @throws Exception
     */
    @GET
    @Path("{actorId}/films")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatFilmDto> getActorFilms(@PathParam(value = "actorId") int id) throws Exception {
        return actorService.getActorFilms(id);
    }

    /**
     * this method to add actor in database
     * 
     * @param actor
     * @return actor
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatActorDto createActor(FlatActorDto actorDto)
            throws ValidationException, Exception {
        actorDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return flatService.add(actorDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    @DELETE
    @Path("{actorId}")
    public boolean deleteActor(@PathParam(value = "actorId") int id) throws Exception {
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

    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatActorDto updateActor(FlatActorDto actorDto) throws Exception {
        actorDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return flatService.update(actorDto);
    }

}
