package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.AddressService;
import gov.iti.jets.services.dto.address.AddressDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("Address")
public class Address {
    private AddressService addressService = new AddressService();

    /**
     * this method to get list of addressies from database
     * 
     * @return
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<AddressDto> getAllAddressies() throws Exception {

        return addressService.get();
    }

    /**
     * @param int id
     * @return AddressDto
     * @throws Exception
     */
    @GET
    @Path("{addressId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public AddressDto getAddress(@PathParam(value = "addressId") int id) throws Exception {
        return addressService.get(id);
    }

    /**
     * this method to add adress in database
     * 
     * @param address
     * @return address
     * @throws ValidationException
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public AddressDto createAddress(AddressDto addressDto)
            throws ValidationException, Exception {
        addressDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return addressService.add(addressDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    @DELETE
    @Path("{adressId}")
    public boolean deleteAddress(@PathParam(value = "adressId") int id) throws Exception {
        addressService.delete(id);
        return true;
    }

    /**
     * update adress
     * 
     * @param AddressDto
     * @return
     * @throws Exception
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public AddressDto updateAdress(AddressDto addressDto) throws Exception {
        addressDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return addressService.update(addressDto);
    }

}
