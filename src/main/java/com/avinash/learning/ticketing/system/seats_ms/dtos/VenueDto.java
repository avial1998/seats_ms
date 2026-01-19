package com.avinash.learning.ticketing.system.seats_ms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueDto {
    @JsonProperty("name")
    private String venueName;
    @JsonProperty("city")
    private String venueCity;
    @JsonProperty("address")
    private String address;
}

