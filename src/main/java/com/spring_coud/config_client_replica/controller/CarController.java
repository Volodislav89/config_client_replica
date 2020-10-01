package com.spring_coud.config_client_replica.controller;

import com.spring_coud.config_client_replica.model.Car;
import com.spring_coud.config_client_replica.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RefreshScope
@AllArgsConstructor
@RequestMapping("/car")
public class CarController {
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/id/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PostMapping
    public Car saveNewCar(@RequestBody Car car) {
        return carService.saveNewCar(car);
    }

    @PutMapping("/update/{id}")
    public Car updateCarById(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCarById(id, car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }
}
