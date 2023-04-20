package gov.iti.jets.services;
import gov.iti.jets.repositories.entities.Rental;

import gov.iti.jets.services.dto.rental.FlatRentalDto;

import gov.iti.jets.services.mappers.rental.FlatRentalMapper;

public class RentalService extends ServiceImpl<Rental, FlatRentalDto, Integer> {
    public RentalService() {
        super(Rental.class, FlatRentalMapper.INSTANCE);
    }
}
