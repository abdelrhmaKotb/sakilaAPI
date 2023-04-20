package gov.iti.jets.services.mappers.rental;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Rental;
import gov.iti.jets.services.dto.rental.FlatRentalDto;

@Mapper
public interface FlatRentalMapper extends gov.iti.jets.services.mappers.Mapper<Rental,FlatRentalDto> {

    FlatRentalMapper INSTANCE = Mappers.getMapper(FlatRentalMapper.class);


}
