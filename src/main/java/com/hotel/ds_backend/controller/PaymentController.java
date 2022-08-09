package com.hotel.ds_backend.controller;

import com.hotel.ds_backend.model.Payments;
import com.hotel.ds_backend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;


    //getAll
    @GetMapping("/payments")
    public List<Payments> getAllPayments(){
        return paymentRepository.findAll();
    }

    //build rest api
    @PostMapping("/addpayments")
    public Payments savePayment(@RequestBody Payments payment){

        return paymentRepository.save(payment);
    }

    //get payment by id
    @GetMapping("/payments/{cardNo}")
    public Optional<Payments> getPaymentyId(@PathVariable("cardNo") long cardNo){
        return paymentRepository.findById(cardNo);
    }
     //update
     @PutMapping("/update/{cardNo}")
     public ResponseEntity<Payments> updateEmployee(@PathVariable("cardNo") long cardNo, @RequestBody Payments payments){

         Payments result = paymentRepository.save(payments);
         return new ResponseEntity<Payments>(payments, HttpStatus.OK);

     }

    @GetMapping("/findmax")
    public Payments getCardNo() {

        return paymentRepository.findTopByOrderByCardNoDesc();
    }

    // //delete
    // @DeleteMapping("{id}")
    // public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
    //     employeeService.deleteEmployee(id);

    //     return new ResponseEntity<String>("Employee deleted successfully", HttpStatus.OK);
    // }
}
