package gov.iti.jets.services.dto.rental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gov.iti.jets.repositories.entities.Payment;
import gov.iti.jets.services.dto.customer.FlatCustomerDto;
import gov.iti.jets.services.dto.inventory.FlatInventoryDto;
import gov.iti.jets.services.dto.staff.FlatStaffDto;

public class FlatRentalDto {
    private Integer id;

    private Date rentalDate;


    private FlatInventoryDto inventory;

   
    private FlatCustomerDto customer;

    private Date returnDate;

   
    private FlatStaffDto staff;

    private Date lastUpdate;

    private List<Payment> payments = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public FlatInventoryDto getInventory() {
        return inventory;
    }

    public void setInventory(FlatInventoryDto inventory) {
        this.inventory = inventory;
    }

    public FlatCustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(FlatCustomerDto customer) {
        this.customer = customer;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public FlatStaffDto getStaff() {
        return staff;
    }
    public void setStaff(FlatStaffDto staff) {
        this.staff = staff;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

}
