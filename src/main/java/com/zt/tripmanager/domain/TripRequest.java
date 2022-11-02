package com.zt.tripmanager.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trip_request")
public class TripRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;

    @Column(name = "estimated_distance")
    private String estimatedDistance;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="expected_end_date")
    private LocalDate expectedEndDate;
}
