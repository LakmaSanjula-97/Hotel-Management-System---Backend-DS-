package com.hotel.ds_backend.controller;

import com.hotel.ds_backend.model.Email;
import com.hotel.ds_backend.service.EmailSenderService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "http://localhost:3000")
public class EmailController {
    private EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;

    }

    //build rest api
    @PostMapping()
    public void saveEmail(@RequestBody Email email){
       String email1 = email.getEmail();


        emailSenderService.sendEmail(email1);
    }

    //get all
//     @GetMapping
//     public List<Email> getAllEmails(){
//         return emailSenderService.getAllEmails();
//     }

    //get payment bi id
//     @GetMapping("{id}")
//     public ResponseEntity<Email> getPaymentyId(@PathVariable("id") long paymentId){
//         return new ResponseEntity<Email>(EmailSenderService.(paymentId), HttpStatus.OK);
//     }

}
