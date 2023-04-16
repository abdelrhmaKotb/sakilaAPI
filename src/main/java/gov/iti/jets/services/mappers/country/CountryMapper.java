package gov.iti.jets.services.mappers.country;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Country;
import gov.iti.jets.services.dto.country.CountryDto;

@Mapper
public interface CountryMapper extends gov.iti.jets.services.mappers.Mapper<Country,CountryDto> {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

}
