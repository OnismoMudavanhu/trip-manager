package com.zt.tripmanager.service.impl;

import com.zt.tripmanager.common.TripStatus;
import com.zt.tripmanager.domain.TripRequest;
import com.zt.tripmanager.repository.TripRequestRepo;
import com.zt.tripmanager.service.api.ITripService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

@Service
public class TripService implements ITripService {

    private TripRequestRepo tripRequestRepo;

    public TripService(TripRequestRepo tripRequestRepo) {
        this.tripRequestRepo = tripRequestRepo;
    }

    @Override
    public String saveTrip(TripRequest tripRequest, BindingResult bindingResult) {
        TripRequest newTripRequest = TripRequest.builder()
                .destination(tripRequest.getDestination())
                .tripStatus(tripRequest.getTripStatus())
                .estimatedDistance(tripRequest.getEstimatedDistance())
                .expectedEndDate(tripRequest.getExpectedEndDate())
                .startDate(tripRequest.getStartDate())
                .build();
        tripRequestRepo.save(newTripRequest);
        return "redirect:/trip?success";
    }

    @Override
    public List<TripRequest> findTripByStatus(TripStatus tripStatus, BindingResult bindingResult) {
        List<TripRequest> tripRequestByTripStatus = tripRequestRepo.findTripRequestByTripStatus(tripStatus);
        return tripRequestByTripStatus;
    }
}
