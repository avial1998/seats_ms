package com.avinash.learning.ticketing.system.seats_ms.controllers;

import com.avinash.learning.ticketing.system.seats_ms.dtos.ResponseDto;
import com.avinash.learning.ticketing.system.seats_ms.dtos.SeatDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addSeat(SeatDto seatDto) {
        // Logic to add seat
        return ResponseEntity.ok(new ResponseDto("SUCCESS", "Seat added successfully"));
    }
}
