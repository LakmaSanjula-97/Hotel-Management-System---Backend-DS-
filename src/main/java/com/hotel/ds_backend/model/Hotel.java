package com.hotel.ds_backend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    @Column(name = "telNo")
    private int telNo;

    @Column(name = "destination")
    private String destination;

    @Column(name = "address")
    private String address;



    @OneToMany(targetEntity = ReservationInformation.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private List<ReservationInformation> reservationInformations;
}
