package com.Bhajandas.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")

public class CloudVendor
{
    @Id
    private String  vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
    private String vendorEmail;
    private String vendorSalary;
    private String vendorDepartment;



    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber, String vendorEmail, String vendorSalary, String vendorDepartment) {
        this.vendorId = vendorId;
        this.vendorName=vendorName;
        this.vendorAddress=vendorAddress;
        this.vendorPhoneNumber=vendorPhoneNumber;
        this.vendorEmail=vendorEmail;
        this.vendorSalary=vendorSalary;
        this.vendorDepartment=vendorDepartment;

    }


    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorSalary() {
        return vendorSalary;
    }

    public void setVendorSalary(String vendorSalary) {
        this.vendorSalary = vendorSalary;
    }

    public String getVendorDepartment() {
        return vendorDepartment;
    }

    public void setVendorDepartment(String vendorDepartment) {
        this.vendorDepartment = vendorDepartment;
    }
}

// id, name, mobile, email, salary, city, country, department, role
