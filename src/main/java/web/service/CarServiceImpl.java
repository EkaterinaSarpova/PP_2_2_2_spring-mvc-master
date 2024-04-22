package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAO carDao) {
        this.carDao = carDao;
    }

    public List<Car> carsList (int count) {

        if (count<5 && count>0) {
            return carDao.carsList().subList(0, count);
        } else {
            return carDao.carsList();
        }
    }
}
