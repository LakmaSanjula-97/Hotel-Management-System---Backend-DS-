package com.hotel.ds_backend.repository;

import com.hotel.ds_backend.model.Payments;
import com.hotel.ds_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments, Long> {

        public Payments findTopByOrderByCardNoDesc();
}
