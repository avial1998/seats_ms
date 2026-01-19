package com.avinash.learning.ticketing.system.seats_ms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDto {
    @JsonProperty("event_id")
    private Long eventId;
    @JsonProperty("user_mobile_number")
    private String userMobileNumber;
    @JsonProperty("number_of_seats")
    private Integer numberOfSeats;
}
