package gov.iti.jets.services.mappers.city;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.City;
import gov.iti.jets.services.dto.city.CityDto;

@Mapper
public interface CityMapper extends gov.iti.jets.services.mappers.Mapper<City,CityDto> {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);
}
