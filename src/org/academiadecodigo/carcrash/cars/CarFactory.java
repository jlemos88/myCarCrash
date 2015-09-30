package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static  Car getNewCar() {

        int randomIndex = (int) (Math.random() * CarType.values().length);

        CarType randomCarType = CarType.values()[randomIndex];

        Car car = new Fiat();

        switch (randomCarType) {

            case ASTONMARTIN:
                car = new AstonMartin();

                break;

            case FIAT:
                car = new Fiat();

                break;
        }
    return car;
    }
}
