package com.hotel.ds_backend.dto;

import com.hotel.ds_backend.model.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {

    private Hotel hotel;
}
