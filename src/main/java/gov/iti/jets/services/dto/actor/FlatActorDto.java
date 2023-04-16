package gov.iti.jets.services.dto.actor;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FlatActorDto implements Serializable {

    private Integer id;

    @NotEmpty(message = "actor must have first name")
    private String firstName;

    @NotEmpty(message = "actor must have last name")
    private String lastName;

    
   
    private Date lastUpdate;   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate=" + lastUpdate
                + "]";
    }

    
}
