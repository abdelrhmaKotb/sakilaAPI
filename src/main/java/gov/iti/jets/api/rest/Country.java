package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CountryService;
import gov.iti.jets.services.dto.country.CountryDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("countries")
public class Country {
    private CountryService countryService = new CountryService();

    /**
     * this method to get list of Countries from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<CountryDto> getAllCountries() throws Exception {
        return countryService.get();
    }

    /**
     * @param int id
     * @return CountryDto
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Path("{countryId}")
    public CountryDto getCountry(@PathParam(value = "countryId") int id) throws Exception {
        return countryService.get(id);
    }

    /**
     * this method to add Country in database
     * 
     * @param country
     * @return countryDto
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public CountryDto createCountry(CountryDto countryDto)
            throws ValidationException, Exception {
        countryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return countryService.add(countryDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    @DELETE
    @Path("{id}")
    public boolean deleteCountry(@PathParam(value = "id") int id) throws Exception {
        countryService.delete(id);
        return true;
    }

    /**
     * update country
     * 
     * @param CountryDto
     * @return
     * @throws Exception
     */
    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public CountryDto updateCountry(CountryDto countryDto) throws Exception, ValidationException {
        countryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return countryService.update(countryDto);
    }

}
