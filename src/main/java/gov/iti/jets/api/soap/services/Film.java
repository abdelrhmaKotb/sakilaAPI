package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.FilmService;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/*
 * Film service 
 * endpoint /ws/Film
 */

@WebService
public class Film {
    private FilmService filmService = new FilmService();

    /**
     * this method to get list of film from database
     * 
     * @return
     * @throws Exception
     */
    public List<FlatFilmDto> getAllFilms() throws Exception {
        return filmService.get(1, 5);
    }

    /**
     * @param int id
     * @return FilmDto
     * @throws Exception
     */
    public FlatFilmDto getFilm(@WebParam(name = "filmId") int id) throws Exception {
        return filmService.get(id);
    }

    // /**
    //  * this method to add film in database
    //  * 
    //  * @param film
    //  * @return film
    //  * @throws ValidationException
    //  */

    // public Integer createFilm(@WebParam(name = "film") FilmDto filmDto)
    //         throws ValidationException, Exception {
    //     filmDto.setLastUpdate(Date.valueOf(LocalDate.now()));
    //     System.out.println(filmDto);
    //     filmDto.getActors().forEach(e -> {
    //         e.setLastUpdate(Date.valueOf(LocalDate.now()));
    //         filmDto.setActor(e);
    //     });
    //     var res = filmService.add(filmDto);
    //     // filmDto.setId(res.getId());
    //     return res.getId();
    //     // return filmDto;
    // }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteFilm(@WebParam(name = "filmId") int id) throws Exception {
        filmService.delete(id);
        return true;
    }

    // /**
    //  * update film
    //  * 
    //  * @param ActorDto
    //  * @return
    //  * @throws Exception
    //  */
    // public FilmDto updateFilm(@WebParam(name = "film") FilmDto filmDto) throws Exception {
    //     filmDto.setLastUpdate(Date.valueOf(LocalDate.now()));
    //     return filmService.update(filmDto);
    // }

}
