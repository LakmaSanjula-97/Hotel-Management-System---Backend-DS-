package com.hotel.ds_backend.repository;

import com.hotel.ds_backend.model.ReservationInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationInfoRepository extends JpaRepository<ReservationInformation, Long> {
}
