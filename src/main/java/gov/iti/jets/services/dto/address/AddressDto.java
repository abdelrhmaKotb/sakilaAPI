package gov.iti.jets.services.dto.address;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import gov.iti.jets.services.dto.city.CityDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressDto implements Serializable {
   
    private Integer id;

    @NotEmpty(message = "must have adress")
    private String address;

    private String address2;

    @NotEmpty(message = "must have district")
    private String district;

    @NotNull(message = "must have city")
    private CityDto city;

    private String postalCode;

    @NotEmpty(message = "must have phone")
    private String phone;

    private Date lastUpdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
