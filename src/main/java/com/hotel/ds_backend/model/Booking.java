package com.hotel.ds_backend.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "roomId", nullable = false)
    private String roomId;

    @Column(name = "unitPrice")
    private String unitPrice;

    @Column(name = "email")
    private String email;

    @Column(name = "checkIn")
    private LocalDate checkIn;

    @Column(name = "checkOut")
    private LocalDate checkOut;
}
