package com.zt.tripmanager.service.api;

import com.zt.tripmanager.common.TripStatus;
import com.zt.tripmanager.domain.TripRequest;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface ITripService {
    String saveTrip(TripRequest tripRequest, BindingResult bindingResult);
    List<TripRequest> findTripByStatus(TripStatus tripStatus, BindingResult bindingResult);
}
