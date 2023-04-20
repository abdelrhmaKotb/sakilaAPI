package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.repositories.entities.Store;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import gov.iti.jets.services.mappers.customer.FlatCustomerMapper;
import gov.iti.jets.services.mappers.inventory.FlatInventoryMapper;
import gov.iti.jets.services.mappers.staff.FlatStaffMapper;
import gov.iti.jets.services.mappers.store.FlatStoreMapper;

public class StoreService extends ServiceImpl<Store, FlatStoreDto, Short> {
    public StoreService() {
        super(Store.class, FlatStoreMapper.INSTANCE);
    }

    public List<FlatStaffDto> getStoreStaff(Short storeId) {
        Store store = get_impl().find(storeId);
        var lisst =  store.getStaff();

        var list = FlatStaffMapper.INSTANCE.mapToDto(lisst);
        return list;
    }

    public List<FlatInventoryDto> getStoreInventories(Short storeId) {
        Store store = get_impl().find(storeId);
        var lisst =  store.getInventories();

        var list = FlatInventoryMapper.INSTANCE.mapToDto(lisst);
        return list;
    }

    public List<FlatCustomerDto> getStoreCustomers(Short storeId) {
        Store store = get_impl().find(storeId);
        var lisst =  store.getCustomers();

        var list = FlatCustomerMapper.INSTANCE.mapToDto(lisst);
        return list;
    }
}
