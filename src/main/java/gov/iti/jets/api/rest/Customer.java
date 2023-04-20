package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.print.attribute.standard.Media;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CustomerService;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
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
 * Customer resource 
 */

@Path("customers")
public class Customer {
    private CustomerService customerService = new CustomerService();

    /**
     * this method to get list of customers from database
     * 
     * @return
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatCustomerDto> getAllCustomers() throws Exception {

        return customerService.get();
    }

    /**
     * @param int id
     * @return FlatCustomerDto
     * @throws Exception
     */

    @GET
    @Path("{customerId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatCustomerDto getCustomer(@PathParam(value = "customerId") int id) throws Exception {
        return customerService.get(id);
    }

    /**
     * this method to add customer in database
     * 
     * @param customer
     * @return customer
     * @throws ValidationException
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatCustomerDto createCustomer(FlatCustomerDto customerDto)
            throws ValidationException, Exception {
        customerDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        customerDto.setCreateDate(Date.valueOf(LocalDate.now()));
        return customerService.add(customerDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{customerId}")
    public boolean deleteCustomer(@PathParam(value = "customerId") int id) throws Exception {
        customerService.delete(id);
        return true;
    }

    /**
     * update cusomer
     * 
     * @param FlatCustomerDto
     * @return
     * @throws Exception
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatCustomerDto updateStore(FlatCustomerDto customerDto) throws Exception {
        customerDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        customerDto.setCreateDate(Date.valueOf(LocalDate.now()));
        return customerService.update(customerDto);
    }

}
