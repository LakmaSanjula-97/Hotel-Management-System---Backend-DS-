package com.hotel.ds_backend.service;

import com.hotel.ds_backend.model.Booking;

import java.util.List;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBooking();

    Booking getBookinById(long id);

    void deleteBooking(long id);
}
