package gov.iti.jets.services.dto.inventory;

import java.util.Date;

import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "inventory")
public class FlatInventoryDto {
   
    private Integer id;

    private FlatFilmDto film;

    private FlatStoreDto store;

    private Date lastUpdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FlatFilmDto getFilm() {
        return film;
    }

    public void setFilm(FlatFilmDto film) {
        this.film = film;
    }

    public FlatStoreDto getStore() {
        return store;
    }

    public void setStore(FlatStoreDto store) {
        this.store = store;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "FlatInventoryDto [id=" + id + ", film=" + film + ", store=" + store + ", lastUpdate=" + lastUpdate
                + "]";
    }

    

}
