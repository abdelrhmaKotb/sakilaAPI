package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.AddressService;
import gov.iti.jets.services.dto.address.AddressDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/*
 * address service 
 * endpoint /ws/Actor
 */

@WebService
public class Address {
    private AddressService addressService = new AddressService();

    /**
     * this method to get list of addressies from database
     * 
     * @return
     * @throws Exception
     */
    public List<AddressDto> getAllAddressies() throws Exception {

        return addressService.get();
    }

    /**
     * @param int id
     * @return AddressDto
     * @throws Exception
     */
    public AddressDto getAddress(@WebParam(name = "addressId") int id) throws Exception {
        return addressService.get(id);
    }

    /**
     * this method to add adress in database
     * 
     * @param address
     * @return address
     * @throws ValidationException
     */

    public AddressDto createAddress(@WebParam(name = "adress") AddressDto addressDto)
            throws ValidationException, Exception {
                addressDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return addressService.add(addressDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteAddress(@WebParam(name = "adressId") int id) throws Exception {
        addressService.delete(id);
        return true;
    }

    /**
     * update adress
     * 
     * @param AddressDto
     * @return
     * @throws Exception
     */
    public AddressDto updateAdress(@WebParam(name = "adress") AddressDto addressDto) throws Exception {
        addressDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return addressService.update(addressDto);
    }

}
