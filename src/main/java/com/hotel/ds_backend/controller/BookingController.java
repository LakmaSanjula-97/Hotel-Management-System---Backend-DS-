package com.hotel.ds_backend.controller;


import com.hotel.ds_backend.model.Booking;
import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/hotels/book")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking){
        return new ResponseEntity<Booking>(bookingService.saveBooking(booking), HttpStatus.CREATED);

    }

    @GetMapping
    public List<Booking> getAllBooking(){
        return bookingService.getAllBooking();
    }

    @GetMapping("{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") long bookingId){
        return new ResponseEntity<Booking>(bookingService.getBookinById(bookingId), HttpStatus.OK);
    }

    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable("id") long id){
        bookingService.deleteBooking(id);
        return new ResponseEntity<String>("Booking deleted successfully", HttpStatus.OK);
    }

}
