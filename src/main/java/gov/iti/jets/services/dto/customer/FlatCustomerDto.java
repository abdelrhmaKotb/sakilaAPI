package gov.iti.jets.services.dto.customer;

import java.io.Serializable;
import java.util.Date;

import gov.iti.jets.services.dto.address.AddressDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class FlatCustomerDto implements Serializable {
    private Integer id;

    @NotNull(message = "cutomer must have sotre")
    private FlatStoreDto store;

    @NotEmpty(message = "customer have first name")
    private String firstName;

    @NotEmpty(message = "customer have last name")
    private String lastName;

    private String email;

    @NotEmpty(message = "customer have address")
    private AddressDto address;

    private Boolean active = false;

    private Date createDate;

    private Date lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FlatStoreDto getStore() {
        return store;
    }

    public void setStore(FlatStoreDto store) {
        this.store = store;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
