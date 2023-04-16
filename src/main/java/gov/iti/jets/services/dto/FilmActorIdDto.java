package gov.iti.jets.services.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link gov.iti.jets.repositories.entities.FilmActorId} entity
 */
public class FilmActorIdDto implements Serializable {
    private Integer actorId;
    private Integer filmId;

    public FilmActorIdDto() {
    }

    public FilmActorIdDto(Integer actorId, Integer filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    @Override
    public String toString() {
        return "(" +
                "actorId = " + actorId + ", " +
                "filmId = " + filmId + ")";
    }

}