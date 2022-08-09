package com.hotel.ds_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="reservationInfo")
public class ReservationInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "roomType", nullable = false)
    private String roomType;

    @Column(name = "availability")
    private String availability;

    @Column(name = "description")
    private String description;

    @Column(name = "unitPrice")
    private String unitPrice;

    @Column(name = "ac_nonAc")
    private String ac_nonAc;


}
