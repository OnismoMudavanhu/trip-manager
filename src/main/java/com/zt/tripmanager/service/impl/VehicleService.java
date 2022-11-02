package com.zt.tripmanager.service.impl;

import com.zt.tripmanager.domain.Vehicle;
import com.zt.tripmanager.repository.VehicleRepo;
import com.zt.tripmanager.service.api.IVehicleService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;


@Service
public class VehicleService implements IVehicleService {
private VehicleRepo vehicleRepo;

    public VehicleService(VehicleRepo vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public String saveVehicle(Vehicle vehicle, BindingResult bindingResult) {
        Vehicle newVehicle = Vehicle.builder()
                .vehicleNo(vehicle.getVehicleNo())
                .name(vehicle.getName())
                .build();
        vehicleRepo.save(newVehicle);
        return "redirect:/add-vehicle?success";
    }

    @Override
    public String findVehicleByRegNo(String regNo, BindingResult bindingResult) {
        return null;
    }
}
