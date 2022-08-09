package com.hotel.ds_backend.model;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name="sms")

public class SmsPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "to", nullable = false)
    private String to;


    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
   
    
    
}
