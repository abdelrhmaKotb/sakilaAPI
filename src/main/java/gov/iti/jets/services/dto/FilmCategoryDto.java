package gov.iti.jets.services.dto;

import java.io.Serializable;
import java.util.Date;

import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.repositories.entities.Film;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * A DTO for the {@link gov.iti.jets.repositories.entities.FilmCategory} entity
 */
@XmlRootElement
public class FilmCategoryDto implements Serializable {
    private FilmCategoryIdDto id;
    private Date lastUpdate;
    
    private Film film;

    private Category category;

    

    public FilmCategoryIdDto getId() {
        return id;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FilmCategoryDto other = (FilmCategoryDto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        } else if (!lastUpdate.equals(other.lastUpdate))
            return false;
        return true;
    }

    public void setId(FilmCategoryIdDto id) {
        this.id = id;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}