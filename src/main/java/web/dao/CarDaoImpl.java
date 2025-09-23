package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();
    ;

    public CarDaoImpl() {
        this.cars = createCars();
    }

    @Override
    public List<Car> createCars() {

        List<Car> carList = new ArrayList<>();

        Car car = new Car("Ford", "Black", 3.5);
        Car car2 = new Car("Kia", "Blue", 1.6);
        Car car3 = new Car("Audi", "White", 2.0);
        Car car4 = new Car("BMW", "Orange", 3.0);
        Car car5 = new Car("Lada", "Red", 1.6);

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }

    @Override
    public List<Car> getCars(Integer count) {

        if (count == null || count >= 5) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
