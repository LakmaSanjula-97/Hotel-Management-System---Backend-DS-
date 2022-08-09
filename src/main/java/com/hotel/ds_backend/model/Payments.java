package com.hotel.ds_backend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="payments")

public class Payments {


     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

    @Column(name = "fullName", nullable = false)
    private String fullName;

//    @Column(name = "nic", nullable = false)
//    private String nic;
    @Column(name = "expDate", nullable = false)
    private String expDate;

    @Id
    @Column(name = "cardNo")
    private long cardNo;

    @Column(name = "cvcNo")
    private long cvcNo;

    @Column(name = "amount")
    private double amount;

    public Payments(long id, String fullName, String expDate, long cardNo, long cvcNo, double amount) {
        this.id = id;
        this.fullName = fullName;
        this.expDate = expDate;
        this.cardNo = cardNo;
        this.cvcNo = cvcNo;
        this.amount = amount;
    }

    public Payments() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNic() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getCvcNo() {
        return cvcNo;
    }

    public void setCvcNo(long cvcNo) {
        this.cvcNo = cvcNo;
    }

    
   


	
    
}
