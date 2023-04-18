package gov.iti.jets.services.mappers.staff;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Staff;
import gov.iti.jets.services.dto.staff.ManagerStaffDto;

@Mapper
public interface ManagerStaffMapper extends gov.iti.jets.services.mappers.Mapper<Staff, ManagerStaffDto> {
    ManagerStaffMapper INSTANCE = Mappers.getMapper(ManagerStaffMapper.class);
}
