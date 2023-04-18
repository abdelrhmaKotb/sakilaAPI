package gov.iti.jets.services.mappers.customer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Customer;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;

@Mapper
public interface FlatCustomerMapper extends gov.iti.jets.services.mappers.Mapper<Customer,FlatCustomerDto>  {
    FlatCustomerMapper INSTANCE = Mappers.getMapper(FlatCustomerMapper.class);

}
