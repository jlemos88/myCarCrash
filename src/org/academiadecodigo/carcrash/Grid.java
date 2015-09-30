package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.field.Position;

import java.util.Vector;

/**
 * Created by jlemos88 on 24/09/15.
 */
public class Grid {

    Car[] cars;

    Grid(Car[] cars) {this.cars = cars;}

    public boolean isEmpty(Position position, Car except) {

        boolean result = true;

        for (Car car : cars) {
            if (car.equals(except)){
                continue;
            }

            if(car.getPos().equals(position)){
                result = false;
            }
        }

        return result;
    }

    public Vector<Car> getCarsAt(Position pos) {
        Vector<Car> result = new Vector<Car>();

        for (Car car : cars){
            if (car.getPos().equals(pos)) {
                result.add(car);
            }
        }

        return result;
    }

}
