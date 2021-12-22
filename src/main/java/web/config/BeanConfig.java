package web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.models.Car;


@Configuration
public class BeanConfig {

    @Bean("car1")
    public Car getCar1(){
        return new Car("BMW", "X7", 2500000);
    }

    @Bean("car2")
    public Car getCar2(){
        return new Car("Lada", "Kalina", 100000);
    }

    @Bean("car3")
    public Car getCar3(){
        return new Car("Mercedes", "Benz", 5000000);
    }

    @Bean("car4")
    public Car getCar4(){
        return new Car("Porshe", "Kayen", 1000000);
    }

    @Bean("car5")
    public Car getCar5(){
        return new Car("Ferrari", "SP3", 99999999);
    }

}
