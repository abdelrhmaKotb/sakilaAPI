package gov.iti.jets.services.mappers.staff;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Staff;
import gov.iti.jets.services.dto.staff.FlatStaffDto;

@Mapper
public interface FlatStaffMapper extends gov.iti.jets.services.mappers.Mapper<Staff, FlatStaffDto> {
    FlatStaffMapper INSTANCE = Mappers.getMapper(FlatStaffMapper.class);
    
}
