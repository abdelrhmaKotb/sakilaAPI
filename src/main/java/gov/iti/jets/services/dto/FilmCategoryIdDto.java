package gov.iti.jets.services.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link gov.iti.jets.repositories.entities.FilmCategoryId} entity
 */
public class FilmCategoryIdDto implements Serializable {
    private  Integer filmId;
    private  Integer categoryId;


    
    

    public FilmCategoryIdDto() {
    }

    public Integer getFilmId() {
        return filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
  
}