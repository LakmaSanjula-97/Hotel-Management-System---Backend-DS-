package com.hotel.ds_backend.controller;

import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.service.HotelSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/hotels/add")
public class HotelController {

    private HotelSevice hotelSevice;

    public HotelController(HotelSevice hotelSevice){
        this.hotelSevice = hotelSevice;
    }
    //add hotel
    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<Hotel>(hotelSevice.saveHotel(hotel), HttpStatus.CREATED);
    }

    //get all
    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelSevice.getAllHotel();
    }

    //get hotel by id
    @GetMapping("{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("id") long hotelId){
        return new ResponseEntity<Hotel>(hotelSevice.getHotelById(hotelId), HttpStatus.OK);
    }

    //update hotel
    @PutMapping("{id}")
    public ResponseEntity updateHotel(@PathVariable("id") long id, @RequestBody Hotel hotel){
        return new ResponseEntity<Hotel>(hotelSevice.updateHotel(hotel, id), HttpStatus.OK);
    }

    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteHotel(@PathVariable("id") long id){
        hotelSevice.deleteHotel(id);
        return new ResponseEntity<String>("Hotel deleted successfully", HttpStatus.OK);
    }
}

