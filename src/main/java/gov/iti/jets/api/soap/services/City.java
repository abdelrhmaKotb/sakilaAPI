package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CityService;
import gov.iti.jets.services.dto.city.CityDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/*
 * City service 
 * endpoint /ws/City
 */


@WebService
public class City {
    private CityService _cityService = new CityService();

    /**
     * this method to get list of cities from database
     * 
     * @return
     * @throws Exception
     */
    public List<CityDto> getAllCities() throws Exception {

        return _cityService.get();
    }

    /**
     * @param int id
     * @return CityDto
     * @throws Exception
     */
    public CityDto getCity(@WebParam(name = "cityId") int id) throws Exception {
        return _cityService.get(id);
    }

    /**
     * this method to add city in database
     * 
     * @param cityDto
     * @return CityDto
     * @throws ValidationException
     */

    public CityDto createCity(@WebParam(name = "city") CityDto cityDto)
            throws ValidationException, Exception {
        cityDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        System.out.println(cityDto);
        return _cityService.add(cityDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteCity(@WebParam(name = "cityId") int id) throws Exception {
        _cityService.delete(id);
        return true;
    }

    /**
     * update city
     * 
     * @param cityDto
     * @return
     * @throws Exception
     */
    public CityDto updateCity(@WebParam(name = "city") CityDto cityDto)
            throws Exception, ValidationException {
                cityDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _cityService.update(cityDto);
    }

}
