package com.zt.tripmanager.service.api;

import com.zt.tripmanager.domain.Vehicle;
import org.springframework.validation.BindingResult;

public interface IVehicleService {
    String saveVehicle(Vehicle vehicle, BindingResult bindingResult);
    String findVehicleByRegNo(String regNo, BindingResult bindingResult);
}
