package intermediario.comportamento.test;

import intermediario.comportamento.dominio.Car;
import intermediario.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("Palio", "red", 2020),new Car("AUDI", "green", 2011), new Car("HONDA FIT", "black", 2015));
    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getCor().equals("green"));
        List<Car> redCars = filterGenerico(cars, car -> car.getCor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getAno() < 2016);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

        List<Integer> listInteger = List.of(1,2,3,4,5,6);
        System.out.println(filterGenerico(listInteger, n -> n % 2 == 0));


    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }

        return filteredCar;
    }

    private static <T> List<T> filterGenerico(List<T> list, Predicate<T> predicate) {
        List<T> filteredCar = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)){
                filteredCar.add(e);
            }
        }

        return filteredCar;
    }

}
