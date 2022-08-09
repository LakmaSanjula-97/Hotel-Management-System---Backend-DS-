package com.hotel.ds_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("minulilavanya@gmail.com");
        message.setTo(toEmail);
        message.setText("Payment is successfull...");
        message.setSubject("Rrgarding the Hotel Payment");

        mailSender.send(message);

        System.out.println("Mail Sent successfully");
    }

}
