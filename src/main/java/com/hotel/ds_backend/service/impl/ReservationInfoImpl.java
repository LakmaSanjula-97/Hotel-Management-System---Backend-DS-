package com.hotel.ds_backend.service.impl;

import com.hotel.ds_backend.exception.ResourceNotFoundException;
import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.model.ReservationInformation;
import com.hotel.ds_backend.repository.HotelRepository;
import com.hotel.ds_backend.repository.ReservationInfoRepository;
import com.hotel.ds_backend.service.ReservationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationInfoImpl implements ReservationInfoService {

    @Autowired
    private ReservationInfoRepository reservationInfoRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public ReservationInformation saveReservationInfo(ReservationInformation reservationInformation) {
        return reservationInfoRepository.save(reservationInformation);
    }

    @Override
    public List<ReservationInformation> getAllReservationInfo() {
        return reservationInfoRepository.findAll();
    }

    @Override
    public ReservationInformation getReservationInfoById(long id) {
        return reservationInfoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ReservationInformation","Id",id));
    }

    @Override
    public ReservationInformation updateReservationInfo(ReservationInformation reservationInformation, long id) {
        ReservationInformation info = reservationInfoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ReservationInformation","Id",id));

        info.setRoomType(reservationInformation.getRoomType());
        info.setAvailability(reservationInformation.getAvailability());
        info.setDescription(reservationInformation.getDescription());
        info.setUnitPrice(reservationInformation.getUnitPrice());
        info.setAc_nonAc(reservationInformation.getAc_nonAc());

        reservationInfoRepository.save(info);

        return info;
    }

    @Override
    public void deleteReservationInfo(long id) {
        reservationInfoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ReservationInformation","Id",id));
        reservationInfoRepository.deleteById(id);
    }

    @Override
    public List<Hotel> getAllRoom() {
        return hotelRepository.findAll();
    }


}
