package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.StaffService;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Staff service 
 * endpoint /ws/Actor
 */

@WebService
public class Staff {
    private StaffService staffService = new StaffService();

    /**
     * this method to get list of Staff from database
     * 
     * @return
     * @throws Exception
     */
    @WebResult(name = "staff")
    public List<FlatStaffDto> getAllStaff() throws Exception {

        return staffService.get();
    }

    /**
     * @param int id
     * @return FlatStaffDto
     * @throws Exception
     */
    public FlatStaffDto getStaff(@WebParam(name = "staffId") Short id) throws Exception {
        return staffService.get(id);
    }


    /**
     * this method to add staff in database
     * 
     * @param staff
     * @return staff
     * @throws ValidationException
     */

    public FlatStaffDto createStaff(@WebParam(name = "staff") FlatStaffDto staffDto)
            throws ValidationException, Exception {
                staffDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return staffService.add(staffDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteStaff(@WebParam(name = "staffId") Short id) throws Exception {
        staffService.delete(id);
        return true;
    }

    /**
     * update staff
     * 
     * @param FlatStaffDto
     * @return
     * @throws Exception
     */
    public FlatStaffDto updateStaff(@WebParam(name = "staff") FlatStaffDto staffDto) throws Exception {
        staffDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return staffService.update(staffDto);
    }


}
