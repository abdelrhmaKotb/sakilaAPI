package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.InventoryService;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Inventory service 
 * endpoint /ws/Actor
 */

@WebService
public class Inventory {
    private InventoryService inventoryService = new InventoryService();

    /**
     * this method to get list of Inventories from database
     * 
     * @return
     * @throws Exception
     */
    @WebResult(name = "inventory")
    public List<FlatInventoryDto> getAllInventories() throws Exception {
        return inventoryService.get();
    }

    /**
     * @param int id
     * @return FlatInventoryDto
     * @throws Exception
     */
    public FlatInventoryDto getInventory(@WebParam(name = "inventoryId") int id) throws Exception {
        return inventoryService.get(id);
    }


    /**
     * this method to add inventory in database
     * 
     * @param inventory
     * @return FlatInventoryDto
     * @throws ValidationException
     */

    public FlatInventoryDto createInventory(@WebParam(name = "inventory") FlatInventoryDto inventoryDto)
            throws ValidationException, Exception {
                inventoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return inventoryService.add(inventoryDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteInventory(@WebParam(name = "inventoryId") int id) throws Exception {
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
    public FlatInventoryDto updateInventory(@WebParam(name = "inventory") FlatInventoryDto inventoryDto) throws Exception {
        inventoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return inventoryService.update(inventoryDto);
    }


}
