package com.spring_coud.config_client_replica.repository;

import com.spring_coud.config_client_replica.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
