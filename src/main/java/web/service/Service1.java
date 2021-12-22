package web.service;

import web.models.Car;

import java.util.List;

public interface Service1 {
    public List<Car> getCarList(String countString);
}
