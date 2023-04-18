package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CustomerService;
import gov.iti.jets.services.StoreService;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * Customer service 
 * endpoint /ws/Actor
 */

@WebService
public class Customer {
    private CustomerService customerService = new CustomerService();

    /**
     * this method to get list of customers from database
     * 
     * @return
     * @throws Exception
     */
    @WebResult(name = "customer")
    public List<FlatCustomerDto> getAllCustomers() throws Exception {

        return customerService.get();
    }

    /**
     * @param int id
     * @return FlatCustomerDto
     * @throws Exception
     */
    public FlatCustomerDto getCustomer(@WebParam(name = "customerId") int id) throws Exception {
        return customerService.get(id);
    }

    /**
     * this method to add customer in database
     * 
     * @param customer
     * @return customer
     * @throws ValidationException
     */

    public FlatCustomerDto createCustomer(@WebParam(name = "customer") FlatCustomerDto customerDto)
            throws ValidationException, Exception {
        customerDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        customerDto.setCreateDate(Date.valueOf(LocalDate.now()));
        return customerService.add(customerDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteCustomer(@WebParam(name = "customerId") int id) throws Exception {
        customerService.delete(id);
        return true;
    }

    /**
     * update cusomer
     * 
     * @param FlatCustomerDto
     * @return
     * @throws Exception
     */
    public FlatCustomerDto updateStore(@WebParam(name = "store") FlatCustomerDto customerDto) throws Exception {
        customerDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        customerDto.setCreateDate(Date.valueOf(LocalDate.now()));
        return customerService.update(customerDto);
    }

}
