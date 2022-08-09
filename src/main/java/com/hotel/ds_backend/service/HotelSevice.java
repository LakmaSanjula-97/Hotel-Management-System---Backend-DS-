package com.hotel.ds_backend.service;

import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.model.Reservation;

import java.util.List;

public interface HotelSevice {

    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotelById(long id);

    Hotel updateHotel(Hotel hotel, long id);

    void deleteHotel(long id);   
}
