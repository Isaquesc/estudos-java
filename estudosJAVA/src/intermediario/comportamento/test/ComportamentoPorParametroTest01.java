package intermediario.comportamento.test;

import intermediario.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(new Car("Palio", "red", 2020),new Car("AUDI", "green", 2011), new Car("HONDA FIT", "black", 2015));
    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("---");
        System.out.println(filterByYearBefore(cars, 2015));
    }
    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCor().equals("green")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCor().equals(cor)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getAno() < year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
