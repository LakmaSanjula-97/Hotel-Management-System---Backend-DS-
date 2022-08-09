package com.hotel.ds_backend.service.impl;

import com.hotel.ds_backend.exception.ResourceNotFoundException;
import com.hotel.ds_backend.model.Booking;
import com.hotel.ds_backend.repository.BookingRepository;
import com.hotel.ds_backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookinById(long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking", "Id", id));
    }

    @Override
    public void deleteBooking(long id) {

    }
}
