package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.repositories.InventoryRepository;
import gov.iti.jets.repositories.entities.Inventory;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import gov.iti.jets.services.mappers.inventory.FlatInventoryMapper;

public class InventoryService extends ServiceImpl<Inventory, FlatInventoryDto, Integer> {
    public InventoryService() {
        super(Inventory.class, FlatInventoryMapper.INSTANCE);
    }

    @Override
    public List<FlatInventoryDto> get() {
        InventoryRepository inventoryRepository = new InventoryRepository();
        var list = FlatInventoryMapper.INSTANCE.mapToDto(inventoryRepository.getAllInventories());
        return list;
    }

    
}
