package com.carlos.cloudpark.controller.mapper;

import com.carlos.cloudpark.controller.dto.ParkingDTO;
import com.carlos.cloudpark.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingMapper {

    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO parkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    
    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return null;
    }
}
