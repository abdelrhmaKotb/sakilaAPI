package gov.iti.jets.services.mappers.address;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Address;
import gov.iti.jets.services.dto.address.AddressDto;

@Mapper
public interface AddressMapper extends gov.iti.jets.services.mappers.Mapper<Address,AddressDto>{
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
}
