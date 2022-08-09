package com.hotel.ds_backend.controller;

import com.hotel.ds_backend.dto.ReservationRequest;
import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.model.Reservation;
import com.hotel.ds_backend.model.ReservationInformation;
import com.hotel.ds_backend.service.ReservationInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/hotel/room")
public class ReservationInfoController {

    private ReservationInfoService reservationInfoService;

    public ReservationInfoController(ReservationInfoService reservationInfoService){
        this.reservationInfoService = reservationInfoService;
    }

    @PostMapping
    public ResponseEntity<ReservationInformation> saveReservationInfo(@RequestBody ReservationInformation reservationInformation){

        return new ResponseEntity<ReservationInformation>(reservationInfoService.saveReservationInfo(reservationInformation), HttpStatus.CREATED);
    }

    @GetMapping
    public List<ReservationInformation> getAllReservationInfo(){
        return reservationInfoService.getAllReservationInfo();
    }

    @GetMapping("{id}")
    public ResponseEntity<ReservationInformation> getReservationInfoById(@PathVariable("id") long reservationInfoId){
        return new ResponseEntity<ReservationInformation>(reservationInfoService.getReservationInfoById(reservationInfoId), HttpStatus.OK);
    }

    @GetMapping("/find")
    public List<Hotel> getAllRoom(){
        return reservationInfoService.getAllRoom();
    }

    @PutMapping("{id}")
    public ResponseEntity<ReservationInformation> upadateReservationInfo(@PathVariable("id") long id, @RequestBody ReservationInformation reservationInformation){
        return new ResponseEntity<ReservationInformation>(reservationInfoService.updateReservationInfo(reservationInformation, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReservationInfo(@PathVariable("id") long id){
        reservationInfoService.deleteReservationInfo(id);
        return new ResponseEntity<String>("Reservation deleted successfully", HttpStatus.OK);
    }



}
