package gov.iti.jets.services.dto.staff;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "manager")
public class ManagerStaffDto {
    private Short id;

    private String firstName;

    private String lastName;

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

    
}
