package gov.iti.jets.services.dto.categories;

import java.sql.Date;
import java.util.Set;

import gov.iti.jets.services.dto.FilmCategoryDto;

public class CategoryFilmCategoriesDto {
    private final Integer id;
    private final String name;
    private final Date lastUpdate;
    private final Set<FilmCategoryDto> filmCategories;

    public CategoryFilmCategoriesDto(Integer id, String name, Date lastUpdate, Set<FilmCategoryDto> filmCategories) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.filmCategories = filmCategories;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Set<FilmCategoryDto> getFilmCategories() {
        return filmCategories;
    }

    @Override
    public String toString() {
        return "CategoryDto [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
    }


}
