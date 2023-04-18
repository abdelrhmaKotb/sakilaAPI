package gov.iti.jets.services.dto.store;

import java.io.Serializable;
import java.util.Date;

import gov.iti.jets.services.dto.address.AddressDto;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import gov.iti.jets.services.dto.staff.ManagerStaffDto;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "store")
public class FlatStoreDto implements Serializable{
   
    private Short id;

    private ManagerStaffDto managerStaff;
   
    private AddressDto address;

    private Date lastUpdate;

   
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public ManagerStaffDto getManagerStaff() {
        return managerStaff;
    }

    public void setManagerStaff(ManagerStaffDto managerStaff) {
        this.managerStaff = managerStaff;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}
