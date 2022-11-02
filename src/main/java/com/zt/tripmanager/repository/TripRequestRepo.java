package com.zt.tripmanager.repository;

import com.zt.tripmanager.domain.TripRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRequestRepo extends JpaRepository<TripRequest, Long> {
}
