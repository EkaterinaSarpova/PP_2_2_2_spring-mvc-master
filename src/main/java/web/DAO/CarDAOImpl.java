package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add (new Car ("Volkswagen", "Polo", 2019));
        cars.add (new Car ("Skoda", "Octavia", 2020));
        cars.add (new Car ("Toyota", "Camry", 2021));
        cars.add (new Car ("Kia", "Mohave", 2022));
        cars.add (new Car ("Volvo", "XC60", 2023));
    }

    public List<Car> carsList (int count) {
        if (count<5 && count>0) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
