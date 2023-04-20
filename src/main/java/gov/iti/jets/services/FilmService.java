package gov.iti.jets.services;

import java.sql.Date;
import java.time.LocalDate;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.repositories.ActorRepository;
import gov.iti.jets.repositories.entities.Actor;
import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.actor.ActorMapper;
import gov.iti.jets.services.mappers.film.FilmMapper;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;

public class FilmService extends ServiceImpl<Film, FlatFilmDto, Integer> {
    public FilmService() {
        super(Film.class, FlatFilmMapper.INSTANCE);
    }

    public Integer createFilm(FilmDto filmDto) throws ValidationException,Exception{

        ServiceImpl<Film,FilmDto,Integer> service = new ServiceImpl<>(Film.class, FilmMapper.INSTANCE);

        filmDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        ActorRepository actorRepository = new ActorRepository();

        filmDto.getActors().forEach(e -> {
            e.setLastUpdate(Date.valueOf(LocalDate.now()));

            Actor a = actorRepository.find(e.getId());
            
            service.get_impl().addToContext(a);

            filmDto.setActor(a);
        });

        FilmDto dto =  service.add(filmDto);
        System.out.println(filmDto);
        return filmDto.getId();
    }

}
