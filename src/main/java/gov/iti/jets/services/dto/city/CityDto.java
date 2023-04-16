package gov.iti.jets.services.dto.city;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import gov.iti.jets.services.dto.country.CountryDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CityDto implements Serializable {
   
    private Integer id;

    @NotEmpty(message = "city must have name")
    private String city;

    @NotNull(message = "city must have country")
    private CountryDto country;

    private Date lastUpdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
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
        return "City [id=" + id + ", city=" + city + ", country = " + country  + ", lastUpdate=" + lastUpdate + "]";
    }

 
}
