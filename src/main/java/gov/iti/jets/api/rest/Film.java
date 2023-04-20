package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.FilmService;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/*
 * Film resource 
 * 
 */

@Path("films")
public class Film {
    private FilmService filmService = new FilmService();

    /**
     * this method to get list of film from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatFilmDto> getAllFilms() throws Exception {
        return filmService.get(1, 5);
    }

    /**
     * @param int id
     * @return FilmDto
     * @throws Exception
     */
    @GET
    @Path("{filmId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatFilmDto getFilm(@PathParam(value = "filmId") int id) throws Exception {
        return filmService.get(id);
    }

    /**
     * this method to add film in database
     * 
     * @param film id
     * @return Integer filmid
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer createFilm(FilmDto filmDto)
            throws ValidationException, Exception {
        return filmService.createFilm(filmDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{filmId}")
    public boolean deleteFilm(@PathParam(value = "filmId") int id) throws Exception {
        filmService.delete(id);
        return true;
    }

    /**
     * update film
     * 
     * @param ActorDto
     * @return
     * @throws Exception
     */
    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatFilmDto updateFilm(FlatFilmDto filmDto) throws Exception {
        filmDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return filmService.update(filmDto);
    }

}
