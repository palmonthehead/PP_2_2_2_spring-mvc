package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "White", 2015));
        cars.add(new Car("BMW", "Red", 2020));
        cars.add(new Car("Audi", "Blue", 2016));
        cars.add(new Car("Honda", "Yellow", 2020));
        cars.add(new Car("Mercedes-Benz", "Green", 2024));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
