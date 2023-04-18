package gov.iti.jets.services;

import gov.iti.jets.repositories.entities.Staff;
import gov.iti.jets.services.dto.staff.FlatStaffDto;
import gov.iti.jets.services.mappers.staff.FlatStaffMapper;

public class StaffService extends ServiceImpl<Staff, FlatStaffDto, Short> {

    public StaffService() {
        super(Staff.class, FlatStaffMapper.INSTANCE);
    }

}
