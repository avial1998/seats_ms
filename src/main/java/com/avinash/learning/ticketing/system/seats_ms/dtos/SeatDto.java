package com.avinash.learning.ticketing.system.seats_ms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDto {
    private int totalSeats;
    private int availableSeats;
    private String category;
    private int eventId;
    private String userMobileNumber;
}
