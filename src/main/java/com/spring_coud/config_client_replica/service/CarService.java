package com.spring_coud.config_client_replica.service;

import com.spring_coud.config_client_replica.model.Car;
import com.spring_coud.config_client_replica.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car saveNewCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }

    public Car updateCarById(Long id, Car car) {
        Car newCar = carRepository.findById(id).get();
        newCar.setBrand(car.getBrand());
        newCar.setModel(car.getModel());
        newCar.setColor(car.getColor());
        newCar.setYear(car.getYear());
        return carRepository.save(newCar);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}
