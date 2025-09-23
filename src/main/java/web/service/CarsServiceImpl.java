package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.CompositeUriComponentsContributor;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(Integer count) {
        return carDao.getCars(count);
    }
}
