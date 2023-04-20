package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.StoreService;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.jws.WebParam;
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
 * Store resource 
 */

@Path("stores")
public class Store {
    private StoreService storeService = new StoreService();

    /**
     * this method to get list of stores from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatStoreDto> getAllStores() throws Exception {

        return storeService.get();
    }

    /**
     * @param int id
     * @return FlatStoreDto
     * @throws Exception
     */

    @GET
    @Path("{storeId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatStoreDto getStore(@PathParam(value = "storeId") Short id) throws Exception {
        return storeService.get(id);
    }

    /**
     * this method to add store in database
     * 
     * @param store
     * @return store
     * @throws ValidationException
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatStoreDto createStore(FlatStoreDto store)
            throws ValidationException, Exception {
        store.setLastUpdate(Date.valueOf(LocalDate.now()));
        return storeService.add(store);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{storeId}")
    public boolean deleteStore(@PathParam(value = "storeId") Short id) throws Exception {
        storeService.delete(id);
        return true;
    }

    /**
     * update store
     * 
     * @param FlatStoreDto
     * @return
     * @throws Exception
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatStoreDto updateStore(FlatStoreDto storeDto) throws Exception {
        storeDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return storeService.update(storeDto);
    }

    /**
     * @return
     */
    @GET
    @Path("{storeId}/staff")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatStaffDto> getStoreStaff(@PathParam(value = "storeId") Short id) {
        return storeService.getStoreStaff(id);
    }

    /**
     * @return
     */

    @GET
    @Path("{storeId}/inventories")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatInventoryDto> getStoreInventories(@PathParam(value = "storeId") Short id) {
        return storeService.getStoreInventories(id);
    }

    /**
     * @return
     */

    @GET
    @Path("{storeId}/customers")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatCustomerDto> getStoreCustomers(@PathParam(value = "storeId") Short id) {
        return storeService.getStoreCustomers(id);
    }

}
