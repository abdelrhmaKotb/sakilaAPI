package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Store;
import gov.iti.jets.services.dto.store.FlatStoreDto;
import gov.iti.jets.services.mappers.store.FlatStoreMapper;

public class StoreService extends  ServiceImpl<Store,FlatStoreDto,Short>{
    public StoreService(){
        super(Store.class, FlatStoreMapper.INSTANCE);
    }
}
