package com.avinash.learning.ticketing.system.seats_ms.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    @JsonProperty("name")
    private String categoryName;
    private Double price;
    @JsonProperty("seat_count")
    private Integer seatCount;
}
