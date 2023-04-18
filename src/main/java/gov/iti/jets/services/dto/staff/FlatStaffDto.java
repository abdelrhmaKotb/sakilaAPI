package gov.iti.jets.services.dto.staff;

import java.io.Serializable;
import java.util.Date;

import gov.iti.jets.services.dto.address.AddressDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "staff")
public class FlatStaffDto implements Serializable{
    private Short id;

    private String firstName;

    private String lastName;

    private AddressDto address;

    private byte[] picture;

    private String email;

    private FlatStoreDto store;

    private Boolean active = false;

    private String username;

    private String password;

    private Date lastUpdate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FlatStoreDto getStore() {
        return store;
    }

    public void setStore(FlatStoreDto store) {
        this.store = store;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
}
