package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component("myService")
public class MyService implements Service1 {

    @Autowired
    private List<Car> carList;

    public List<Car> getCarList(String countString) {
        long count;

        try {
            count = Long.parseLong(countString);
            if (count >= 5) {
                count = carList.size();
            }
        } catch (Exception e) {
            count = carList.size();
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
