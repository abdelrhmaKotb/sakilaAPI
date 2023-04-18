package gov.iti.jets.repositories.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "SMALLINT UNSIGNED not null")
    private Integer id;

    @Column(name = "title", length = 128)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @Column(name = "rental_duration", columnDefinition = "TINYINT UNSIGNED not null")
    private Short rentalDuration;

    @Column(name = "rental_rate", precision = 4, scale = 2)
    private Double rentalRate;

    @Column(name = "length", columnDefinition = "SMALLINT UNSIGNED")
    private Integer length;

    @Column(name = "replacement_cost", precision = 5, scale = 2)
    private Double replacementCost;

    @Lob
    @Column(name = "rating")
    private String rating;

    @Lob
    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "last_update")
    private Date lastUpdate;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Inventory> inventories = new LinkedHashSet<>();

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FilmActor> actors = new LinkedHashSet<>();

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FilmCategory> filmCategories = new LinkedHashSet<>();

    // public void setActor(Actor actor){
    // FilmActor filmActor = new FilmActor(actor, this);
    // filmActors.add(filmActor);
    // actor.getFilmActors().add(filmActor);
    // }

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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(Language originalLanguage) {
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

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

    public Set<FilmActor> getFilmActors() {
        return actors;
    }

    public void setFilmActors(Set<FilmActor> actors) {
        // this.filmActors = filmActors;
        var i = actors.iterator();
        while (i.hasNext()) {
            System.out.println("here");
            this.actors.add(new FilmActor(i.next().getActor(), this));
        }
        System.out.println("Ds " + actors);
    }

    public Set<FilmCategory> getFilmCategories() {
        return filmCategories;
    }

    public void setFilmCategories(Set<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

    @Override
    public String toString() {
        return "Film [id=" + id + ", title=" + title + ", description=" + description + ", releaseYear=" + releaseYear
                + ", language=" + language + ", originalLanguage=" + originalLanguage + ", rentalDuration="
                + rentalDuration + ", rentalRate=" + rentalRate + ", length=" + length + ", replacementCost="
                + replacementCost + ", rating=" + rating + ", specialFeatures=" + specialFeatures + ", lastUpdate="
                + lastUpdate + ", inventories=" + inventories + ", filmActors=" + actors + ", filmCategories="
                + filmCategories + "]";
    }

}