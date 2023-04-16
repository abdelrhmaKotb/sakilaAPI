package gov.iti.jets.repositories.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "film_actor")
public class FilmActor {
    @EmbeddedId
    private FilmActorId id = new FilmActorId();

    @MapsId("actorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.MERGE)
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    @MapsId("filmId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    

    public FilmActor() {
    }

    

    public FilmActor(Actor actor, Film film) {
        this.actor = actor;
        this.film = film;
    }



    @Column(name = "last_update", nullable = false)
    private Date lastUpdate = java.sql.Date.valueOf(LocalDate.now());

    public FilmActorId getId() {
        return id;
    }

    public void setId(FilmActorId id) {
        this.id = id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
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
        return "FilmActor [id=" + id + ", actor=" + actor.getId() + ", film=" + film.getId() + ", lastUpdate=" + lastUpdate + "]";
    }

    

}