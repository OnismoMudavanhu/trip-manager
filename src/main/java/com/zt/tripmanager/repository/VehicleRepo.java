package com.zt.tripmanager.repository;

import com.zt.tripmanager.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
}
