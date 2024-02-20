package intermediario.comportamento.interfaces;

import intermediario.comportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car);

}
