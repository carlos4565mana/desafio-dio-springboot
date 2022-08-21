package com.carlos.cloudpark.controller;

import com.carlos.cloudpark.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){
        var parking = new Parking();
        parking.setColor("BLACK");
        parking.setLicense("MSS-1111");
        parking.setModel("VM GOL");
        parking.setState("SP");

        return Arrays.asList(parking, parking);
    }
}
