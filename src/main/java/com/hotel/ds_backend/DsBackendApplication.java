package com.hotel.ds_backend;

//import com.hotel.ds_backend.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DsBackendApplication {

//    @Autowired
//    private EmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(DsBackendApplication.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//
////    public void sendMail(){
////        senderService.sendEmail("minulilavanya@gmail.com", "This is subject", "This is body of mail");
////
////    }

}
