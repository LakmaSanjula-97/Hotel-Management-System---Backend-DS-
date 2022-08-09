package com.hotel.ds_backend.service;


import com.hotel.ds_backend.model.Hotel;
import com.hotel.ds_backend.model.ReservationInformation;

import java.util.List;

public interface ReservationInfoService {

    ReservationInformation saveReservationInfo(ReservationInformation reservationInformation);

    List<ReservationInformation> getAllReservationInfo();

    ReservationInformation getReservationInfoById(long id);

    ReservationInformation updateReservationInfo(ReservationInformation reservationInformation, long id);

    void deleteReservationInfo(long id);

    List<Hotel> getAllRoom();

//    Hotel saveRooms(Hotel hotel);
}
