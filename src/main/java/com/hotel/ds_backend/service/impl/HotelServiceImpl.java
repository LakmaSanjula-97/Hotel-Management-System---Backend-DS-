package com.hotel.ds_backend.service.impl;

import com.hotel.ds_backend.exception.ResourceNotFoundException;
import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.repository.HotelRepository;
import com.hotel.ds_backend.service.HotelSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelSevice {

    @Autowired
    private HotelRepository hotelRepository;

    //add hotel
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    //get all
    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    //get by id
    @Override
    public Hotel getHotelById(long id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel", "Id", id));
    }

    @Override
    public Hotel updateHotel(Hotel hotel, long id) {
        Hotel existingHotel = hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel", "Id", id));

        existingHotel.setName(hotel.getName());
        existingHotel.setEmail(hotel.getEmail());
        existingHotel.setTelNo(hotel.getTelNo());
        existingHotel.setDescription(hotel.getDescription());
        existingHotel.setDestination(hotel.getDestination());
        existingHotel.setAddress(hotel.getAddress());

        hotelRepository.save(existingHotel);
        return existingHotel;
    }

    @Override
    public void deleteHotel(long id) {
        hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel", "Id", id));
        hotelRepository.deleteById(id);
    }
}
