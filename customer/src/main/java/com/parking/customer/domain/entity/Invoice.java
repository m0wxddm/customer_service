package com.parking.customer.domain.entity;

import java.time.LocalDateTime;

import com.parking.customer.domain.dto.ParkingLotDTO;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private VehicleTypeEnum vehicleType;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private LocalDateTime createdTime;

    @Column
    @ManyToOne
    @JoinColumn(name = "vehicleId", nullable = false)
    private Vehicle vehicle;

    @Column(nullable = false)
    private Long parkingLotId;
}
