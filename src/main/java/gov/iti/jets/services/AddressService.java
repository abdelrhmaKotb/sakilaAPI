package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Address;
import gov.iti.jets.services.dto.address.AddressDto;
import gov.iti.jets.services.mappers.address.AddressMapper;


public class AddressService extends ServiceImpl<Address,AddressDto,Integer> {
    public AddressService(){
        super(Address.class, AddressMapper.INSTANCE);
    }
}
