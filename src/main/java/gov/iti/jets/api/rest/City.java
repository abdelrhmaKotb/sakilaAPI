package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CityService;
import gov.iti.jets.services.CountryService;
import gov.iti.jets.services.dto.city.CityDto;
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

@Path("cities")
public class City {
    private CityService cityService = new CityService();

    /**
     * this method to get list of cities from database
     * 
     * @return
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<CityDto> getAllCities() throws Exception {

        return cityService.get();
    }

    /**
     * @param int id
     * @return CityDto
     * @throws Exception
     */
    @GET
    @Path("{cityId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CityDto getCity(@PathParam(value = "cityId") int id) throws Exception {
        return cityService.get(id);
    }

    /**
     * this method to add city in database
     * 
     * @param cityDto
     * @return CityDto
     * @throws ValidationException
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CityDto createCity(CityDto cityDto)
            throws ValidationException, Exception {
        cityDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        System.out.println(cityDto);
        return cityService.add(cityDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{cityId}")
    public boolean deleteCity(@PathParam(value = "cityId") int id) throws Exception {
        cityService.delete(id);
        return true;
    }

    /**
     * update city
     * 
     * @param cityDto
     * @return
     * @throws Exception
     */

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CityDto updateCity(CityDto cityDto)
            throws Exception, ValidationException {
        cityDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return cityService.update(cityDto);
    }

}
