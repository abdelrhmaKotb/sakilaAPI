package gov.iti.jets;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.api.soap.services.Film;
import gov.iti.jets.services.ActorService;
import gov.iti.jets.services.AddressService;
import gov.iti.jets.services.FilmService;
import gov.iti.jets.services.LanguageService;
import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.dto.language.LanguageDto;

public class Main {
    public static void main(String[] args) {


        FilmDto filmDto = new FilmDto();
        // filmDto.setId(1002);
        filmDto.setTitle("new film wqwqwqws");
        filmDto.setReleaseYear(2004);
        filmDto.setLanguage(new LanguageDto(1, null, null));
        filmDto.setOriginalLanguage(new LanguageDto(1, null, null));
        filmDto.setRentalDuration((short)5);
        filmDto.setRentalRate(5.0);
        filmDto.setReplacementCost(50.0);

        List<ActorDto> ac = new ArrayList<>();
        ac.add(new ActorDto(1));
        ac.add(new ActorDto(2));
        ac.add(new ActorDto(4));

        filmDto.setActors(ac);





        Film f = new Film();
        try {
            f.createFilm(filmDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Film f = new Film();
        // FilmDto dto = new FilmDto();
        // ActorDto ac = new ActorDto();
        // ac.setFirstName("new ");
        // ac.setLastName("actor here");
        // // ac.setId(1);
        // ac.setLastUpdate(java.sql.Date.valueOf(LocalDate.now()));
        // // ac.setId(1);

        // dto.setTitle("film drto");
        // dto.setActor(ac);
        // dto.setReplacementCost(55D);
        // dto.setRentalRate(55D);
        // dto.setRentalDuration((short)4);
        // dto.setLastUpdate(Date.valueOf(LocalDate.now()));
        // LanguageDto dto2 =  new LanguageDto();
        // // dto2.setId(1);
        // dto2.setName("Ds");
        // // dto.setLanguage(dto2);
        // // dto.setActors();
        
        // try {
        //     f.createFilm(dto);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

    }
}