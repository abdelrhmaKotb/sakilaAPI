package gov.iti.jets.services.mappers.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Inventory;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;

@Mapper
public interface FlatInventoryMapper extends gov.iti.jets.services.mappers.Mapper<Inventory,FlatInventoryDto> {
    FlatInventoryMapper INSTANCE = Mappers.getMapper(FlatInventoryMapper.class);
    
}
