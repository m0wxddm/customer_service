package com.parking.customer.domain.dto;

import com.parking.customer.domain.entity.ParkingLot;

import lombok.*;

@Getter
@Setter
public class ParkingLotDTO {
    private Long id;
    private String name;
    private String address;
    private double longtitude;
    private double latitude;
}
