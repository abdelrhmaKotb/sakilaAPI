package gov.iti.jets.services.mappers.store;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Store;
import gov.iti.jets.services.dto.store.FlatStoreDto;

@Mapper
public interface FlatStoreMapper extends gov.iti.jets.services.mappers.Mapper<Store, FlatStoreDto> {
    FlatStoreMapper INSTANCE = Mappers.getMapper(FlatStoreMapper.class);
    
}
