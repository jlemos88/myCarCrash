package org.academiadecodigo.carcrash;

import com.sun.corba.se.impl.protocol.giopmsgheaders.CancelRequestMessage;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    Grid grid;

    /** Graphical Car Field */
    Field field;

    /** Container of Cars */
    Car[] cars;

    /** Animation delay */
    int delay;

    Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[]{
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
                CarFactory.getNewCar(),
        };

        Field.draw(cars);

        grid = new Grid(cars);

        for (Car car : cars) {
            car.setGrid(grid);
        }
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            for(Car car : cars) {
                if (!car.isCrashed()) {
                    car.move();
                    testCrash(car);
                }
            }

            // Update screen
            Field.draw(cars);


        }

    }

    public void testCrash(Car car) {
        for (Car otherCar : cars){
            if (car != otherCar) {
                if (car.getPos().equals(otherCar.getPos())) {
                    car.crash();
                    otherCar.crash();
                }
            }
        }
    }



}
