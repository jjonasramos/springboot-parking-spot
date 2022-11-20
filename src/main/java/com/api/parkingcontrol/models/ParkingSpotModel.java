package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
  private static final long serialVerionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Getter @Setter
  private UUID id;

  @Column(nullable = false, unique = true, length = 10)
  @Getter @Setter
  private String parkingSpotNumber;

  @Column(nullable = false, unique = true, length = 7)
  @Getter @Setter
  private String licensePlateCar;

  @Column(nullable = false, length = 70)
  @Getter @Setter
  private String brandCar;

  @Column(nullable = false, length = 70)
  @Getter @Setter
  private String modelCar;

  @Column(nullable = false, length = 70)
  @Getter @Setter
  private String colorCar;

  @Column(nullable = false)
  @Getter @Setter
  private LocalDateTime registrationDate;

  @Column(nullable = false, length = 130)
  @Getter @Setter
  private String responsibleName;

  @Column(nullable = false, length = 30)
  @Getter @Setter
  private String apartment;

  @Column(nullable = false, length = 30)
  @Getter @Setter
  private String block;
  
}
