package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Country;
import gov.iti.jets.services.dto.country.CountryDto;
import gov.iti.jets.services.mappers.country.CountryMapper;

public class CountryService extends ServiceImpl<Country,CountryDto,Integer> {

    public CountryService(){
        super(Country.class, CountryMapper.INSTANCE);
    }

}
