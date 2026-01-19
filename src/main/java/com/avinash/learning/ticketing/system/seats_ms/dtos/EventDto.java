package com.avinash.learning.ticketing.system.seats_ms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    @JsonProperty("event_name")
    private String eventName;
    @JsonProperty("event_description")
    private String eventDescription;
    private VenueDto venue;
    @JsonProperty("event_date")
    private LocalDate eventDate;
    private List<CategoryDto> categories;
    private Long id;
}
