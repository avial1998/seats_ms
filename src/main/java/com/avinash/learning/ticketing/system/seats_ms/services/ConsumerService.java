package com.avinash.learning.ticketing.system.seats_ms.services;

import com.avinash.learning.ticketing.system.seats_ms.dtos.BookingDto;
import com.avinash.learning.ticketing.system.seats_ms.dtos.EventDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "events-topic")
    public void consume(EventDto eventDto){
        // logic to save seats for the event for each category
        System.out.println("Consumed event: " + eventDto);
    }

    @KafkaListener(topics = "booking-topic")
    public void consume(BookingDto bookingDto){
        // logic to update seats based on booking
        System.out.println("Consumed booking: " + bookingDto);
    }
}
