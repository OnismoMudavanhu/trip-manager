package com.zt.tripmanager.repository;

import com.zt.tripmanager.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findVehicleByVehicleNo(String vehicleNo);
}
