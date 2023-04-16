package gov.iti.jets.services.dto.country;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CountryDto  implements Serializable{

    private Integer id;

    @NotEmpty(message = "country must have name")
    private String country;

    private Date lastUpdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Override
    public String toString() {
        return "Country [id=" + id + ", country=" + country + ", lastUpdate=" + lastUpdate + "]";
    }

    
}
