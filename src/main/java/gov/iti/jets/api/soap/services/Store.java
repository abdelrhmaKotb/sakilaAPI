package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.StoreService;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Store service 
 * endpoint /ws/Actor
 */

@WebService
public class Store {
    private StoreService storeService = new StoreService();

    /**
     * this method to get list of stores from database
     * 
     * @return
     * @throws Exception
     */
    @WebResult(name = "store")
    public List<FlatStoreDto> getAllStores() throws Exception {

        return storeService.get();
    }

    /**
     * @param int id
     * @return FlatStoreDto
     * @throws Exception
     */
    public FlatStoreDto getStore(@WebParam(name = "storeId") Short id) throws Exception {
        return storeService.get(id);
    }


    /**
     * this method to add store in database
     * 
     * @param store
     * @return store
     * @throws ValidationException
     */

    public FlatStoreDto createStore(@WebParam(name = "store") FlatStoreDto store)
            throws ValidationException, Exception {
                store.setLastUpdate(Date.valueOf(LocalDate.now()));
        return storeService.add(store);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteStore(@WebParam(name = "storeId") Short id) throws Exception {
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
    public FlatStoreDto updateStore(@WebParam(name = "store") FlatStoreDto storeDto) throws Exception {
        storeDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return storeService.update(storeDto);
    }


}
