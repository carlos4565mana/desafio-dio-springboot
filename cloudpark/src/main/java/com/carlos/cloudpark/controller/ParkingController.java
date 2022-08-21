package com.carlos.cloudpark.controller;

import com.carlos.cloudpark.controller.dto.ParkingDTO;
import com.carlos.cloudpark.controller.mapper.ParkingMapper;
import com.carlos.cloudpark.model.Parking;
import com.carlos.cloudpark.service.ParkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    public List<ParkingDTO> findAll(){
        List<Parking> parkingList =  parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
    }
}
