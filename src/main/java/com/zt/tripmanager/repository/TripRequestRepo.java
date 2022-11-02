package com.zt.tripmanager.repository;

import com.zt.tripmanager.common.TripStatus;
import com.zt.tripmanager.domain.TripRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRequestRepo extends JpaRepository<TripRequest, Long> {
    List<TripRequest> findTripRequestByTripStatus(TripStatus tripStatus);
}
