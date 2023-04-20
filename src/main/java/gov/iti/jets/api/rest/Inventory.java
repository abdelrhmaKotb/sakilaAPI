package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.InventoryService;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
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
 * Inventory resource 
 */

@Path("inventories")
public class Inventory {
    private InventoryService inventoryService = new InventoryService();

    /**
     * this method to get list of Inventories from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatInventoryDto> getAllInventories() throws Exception {
        return inventoryService.get();
    }

    /**
     * @param int id
     * @return FlatInventoryDto
     * @throws Exception
     */

    @GET
    @Path("{inventoryId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public FlatInventoryDto getInventory(@PathParam(value = "inventoryId") int id) throws Exception {
        return inventoryService.get(id);
    }

    /**
     * this method to add inventory in database
     * 
     * @param inventory
     * @return FlatInventoryDto
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatInventoryDto createInventory(FlatInventoryDto inventoryDto)
            throws ValidationException, Exception {
        inventoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return inventoryService.add(inventoryDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{inventoryId}")
    public boolean deleteInventory(@PathParam(value = "inventoryId") int id) throws Exception {
        inventoryService.delete(id);
        return true;
    }

    /**
     * update inventory
     * 
     * @param FlatInventoryDto
     * @return
     * @throws Exception
     */

    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatInventoryDto updateInventory(FlatInventoryDto inventoryDto)
            throws Exception {
        inventoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return inventoryService.update(inventoryDto);
    }

}
