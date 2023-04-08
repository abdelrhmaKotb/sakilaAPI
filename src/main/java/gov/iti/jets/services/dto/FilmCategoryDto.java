package gov.iti.jets.services.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.repositories.entities.FilmCategory} entity
 */
public class FilmCategoryDto implements Serializable {
    private final FilmCategoryIdDto id;
    private final Date lastUpdate;

    public FilmCategoryDto(FilmCategoryIdDto id, Date lastUpdate) {
        this.id = id;
        this.lastUpdate = lastUpdate;
    }

    public FilmCategoryIdDto getId() {
        return id;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

 
}