package com.Bhajandas.demo.controller;

import com.Bhajandas.demo.model.CloudVendor;
import com.Bhajandas.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {


    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


//for specific cloud vendor detatils
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);

        //return new CloudVendor("C1","Bhajandas","bhayander","1234","me@gmail.com","xxxxx","IT");
    }
//for all cloud vendor details from database
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudVendors();

        //return new CloudVendor("C1","Bhajandas","bhayander","1234","me@gmail.com","xxxxx","IT");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor Crerated Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor Deleted Successfully";
    }
}

