package gov.iti.jets.repositories.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id", columnDefinition = "TINYINT UNSIGNED not null")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<FilmCategory> filmCategories = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set<FilmCategory> getFilmCategories() {
        return filmCategories;
    }

    public void setFilmCategories(Set<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

    

}