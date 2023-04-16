package gov.iti.jets.services.dto.categories;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import gov.iti.jets.repositories.entities.FilmCategory;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class CategoryFilmCategoriesDto implements Serializable {

    private Integer id;
    private String name;
    private Date lastUpdate;

    @Transient
    private Set<FilmCategory> filmCategories = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

   

   
    @Override
    public String toString() {
        return "CategoryFilmCategoriesDto [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate
                + ", filmCategories=" + filmCategories + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set<FilmCategory> getFilmCategories() {
        return filmCategories;
    }

    @Transient
    public void setFilmCategories(Set<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

}
