package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.RentalService;
import gov.iti.jets.services.dto.rental.FlatRentalDto;

import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/*
 * Rental resurce 
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

    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Consumes(MediaType.APPLICATION_JSON)
    public FlatRentalDto createRenatal(FlatRentalDto rental)
            throws ValidationException, Exception {
        rental.setLastUpdate(Date.valueOf(LocalDate.now()));
        return rentalService.add(rental);
    }

}
