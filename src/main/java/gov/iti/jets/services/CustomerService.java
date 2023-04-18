package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Customer;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.mappers.customer.FlatCustomerMapper;

public class CustomerService extends ServiceImpl<Customer, FlatCustomerDto, Integer> {
    public CustomerService() {
        super(Customer.class, FlatCustomerMapper.INSTANCE);
    }
}
