package gov.iti.jets.services.dto.actor;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotEmpty;

import gov.iti.jets.repositories.entities.FilmActor;
import gov.iti.jets.services.dto.FilmActorDto;
import gov.iti.jets.services.dto.film.FilmDto;
import gov.iti.jets.services.mappers.actor.ActorMapper;
import gov.iti.jets.services.mappers.film.FilmMapper;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "actor")
@Access(AccessType.FIELD)
public class ActorDto implements Serializable {

    private Integer id;

    @NotEmpty(message = "actor must have first name")
    private String firstName;

    @NotEmpty(message = "actor must have last name")
    private String lastName;

    @Transient
    private Set<FilmActor> filmActors = new LinkedHashSet<>();

    
    

    

    public ActorDto(Integer id) {
        this.id = id;
    }



    public ActorDto() {
    }



    @Transient
    public Set<FilmActor> getFilmActors() {
        return filmActors;
    }

    public void setFilmActors(Set<FilmActor> filmActors) {
        this.filmActors = filmActors;
    }

    private Date lastUpdate;

    public void setFilm(FilmDto film){
        FilmActor filmActor = new FilmActor();
        filmActor.setActor(ActorMapper.INSTANCE.toEntity(this));
        filmActor.setFilm(FilmMapper.INSTANCE.toEntity(film));
        filmActors.add(filmActor);
        film.getFilmActors().add(filmActor);
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate=" + lastUpdate
                + "]";
    }

}
