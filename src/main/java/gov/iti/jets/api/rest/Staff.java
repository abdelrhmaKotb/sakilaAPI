package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.StaffService;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/*
 * Staff resource
 */

@Path("staff")
public class Staff {
    private StaffService staffService = new StaffService();

    /**
     * this method to get list of Staff from database
     * 
     * @return
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatStaffDto> getAllStaff() throws Exception {

        return staffService.get();
    }

    /**
     * @param int id
     * @return FlatStaffDto
     * @throws Exception
     */

    @GET
    @Path("{staffId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatStaffDto getStaff(@PathParam(value = "staffId") Short id) throws Exception {
        return staffService.get(id);
    }

    /**
     * this method to add staff in database
     * 
     * @param staff
     * @return staff
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatStaffDto createStaff(FlatStaffDto staffDto)
            throws ValidationException, Exception {
        staffDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return staffService.add(staffDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    @DELETE
    @Path("{staffId}")
    public boolean deleteStaff(@PathParam(value = "staffId") Short id) throws Exception {
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

    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatStaffDto updateStaff(FlatStaffDto staffDto) throws Exception {
        staffDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return staffService.update(staffDto);
    }

}
