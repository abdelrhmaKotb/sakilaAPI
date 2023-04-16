package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CountryService;
import gov.iti.jets.services.dto.country.CountryDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/*
 * Country service 
 * endpoint /ws/Country
 */

@WebService
public class Country {
    private CountryService _countryService = new CountryService();

    /**
     * this method to get list of Countries from database
     * 
     * @return
     * @throws Exception
     */
    public List<CountryDto> getAllCountries() throws Exception {

        return _countryService.get();
    }

    /**
     * @param int id
     * @return CountryDto
     * @throws Exception
     */
    public CountryDto getCountry(@WebParam(name = "countryId") int id) throws Exception {
        return _countryService.get(id);
    }

    /**
     * this method to add Country in database
     * 
     * @param country
     * @return countryDto
     * @throws ValidationException
     */

    public CountryDto createCountry(@WebParam(name = "country") CountryDto countryDto)
            throws ValidationException, Exception {
        countryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _countryService.add(countryDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteCountry(@WebParam(name = "countryId") int id) throws Exception {
        _countryService.delete(id);
        return true;
    }

    /**
     * update country
     * 
     * @param CountryDto
     * @return
     * @throws Exception
     */
    public CountryDto updateCountry(@WebParam(name = "country") CountryDto countryDto) throws Exception ,ValidationException {
        countryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _countryService.update(countryDto);
    }

}
