package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.City;
import gov.iti.jets.services.dto.city.CityDto;
import gov.iti.jets.services.mappers.city.CityMapper;

public class CityService extends ServiceImpl<City, CityDto, Integer> {
    public CityService() {
        super(City.class, CityMapper.INSTANCE);
    }
}
