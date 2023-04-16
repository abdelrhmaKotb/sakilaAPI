package gov.iti.jets.services.dto.film;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import gov.iti.jets.repositories.entities.FilmActor;
import gov.iti.jets.services.dto.FilmCategoryDto;
import gov.iti.jets.services.dto.actor.ActorDto;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.dto.language.LanguageDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "film")
public class FlatFilmDto implements Serializable {
   
    private Integer id;

    @NotEmpty(message = "film must have title")
    private String title;

   
    private String description;

    private Integer releaseYear;

    // @NotNull(message = "film must have language")
    private LanguageDto language;

    private LanguageDto originalLanguage;

    @NotNull(message = "film must have rental duration")
    private Short rentalDuration;

    @NotNull(message = "film must have rental rate")
    private Double rentalRate;

    private Integer length;

    @NotNull(message = "film must have replacement cost")
    private Double replacementCost;

    private String rating;

    private String specialFeatures;

    private Date lastUpdate;

    

    public FlatFilmDto() {
    }

    public FlatFilmDto(Integer id, @NotEmpty(message = "film must have title") String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public LanguageDto getLanguage() {
        return language;
    }

    public void setLanguage(LanguageDto language) {
        this.language = language;
    }

    public LanguageDto getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(LanguageDto originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    public void setActors(ActorDto actor) {
           
    }



    
  

    @Override
    public String toString() {
        return "FilmDto [id=" + id + ", title=" + title + ", description=" + description + ", releaseYear="
                + releaseYear + ", language=" + language + ", originalLanguage=" + originalLanguage
                + ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate + ", length=" + length
                + ", replacementCost=" + replacementCost + ", rating=" + rating + ", specialFeatures=" + specialFeatures
                + ", lastUpdate=" + lastUpdate + ", actors="  + ", categories="  + ", filmActors="
                 + ", filmCategories="  + "]";
    }




}
