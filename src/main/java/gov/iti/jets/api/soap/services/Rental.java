package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.RentalService;
import gov.iti.jets.services.StoreService;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import gov.iti.jets.services.dto.rental.FlatRentalDto;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Rental service 
 * endpoint /ws/Rental
 */

@WebService
public class Rental {
    private RentalService rentalService = new RentalService();


    /**
     * this method to add renatal 
     * 
     * @param rental
     * @return rental
     * @throws ValidationException
     */

    public FlatRentalDto createRental(@WebParam(name = "rental") FlatRentalDto rental)
            throws ValidationException, Exception {
                rental.setLastUpdate(Date.valueOf(LocalDate.now()));
        return rentalService.add(rental);
    }


}
