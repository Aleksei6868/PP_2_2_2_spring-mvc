package web.config.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsServiceImpl implements CarsService {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        Car car = new Car("Ford", "Black", 3.5);
        Car car2 = new Car("Kia", "Blue", 1.6);
        Car car3 = new Car("Audi", "White", 2.0);
        Car car4 = new Car("BMW", "Orange", 3.0);
        Car car5 = new Car("Lada", "Red", 1.6);
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
