package gov.iti.jets.services.dto;

import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.film.FilmDto;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.repositories.entities.FilmActor} entity
 */

@XmlRootElement
public class FilmActorDto implements Serializable {

    private FilmActorIdDto id;

    private ActorDto actor;

    private FilmDto film;

    private Date lastUpdate;

    public FilmActorDto(ActorDto actor, FilmDto film) {
        this.actor = actor;
        this.film = film;
    }

    public FilmActorDto() {
    }

    public FilmActorIdDto getId() {
        return id;
    }

    public void setId(FilmActorIdDto id) {
        this.id = id;
    }

    public ActorDto getActor() {
        return actor;
    }

    public void setActor(ActorDto actor) {
        this.actor = actor;
    }

    public FilmDto getFilm() {
        return film;
    }

    public void setFilm(FilmDto film) {
        this.film = film;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "(" +
                "id = " + id + ", " +
                "actor = " + actor + ", " +
                "film = "  + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }

}