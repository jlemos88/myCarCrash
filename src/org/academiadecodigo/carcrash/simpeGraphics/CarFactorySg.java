package org.academiadecodigo.carcrash.simpeGraphics;

import org.academiadecodigo.carcrash.cars.*;

/**
 * Created by jlemos88 on 28/09/15.
 */
public class CarFactorySg {

    public static CarSg getNewCarSg() {


        int randomIndex = (int) (Math.random() * CarType.values().length);

        CarTypeSg randomCarType = CarTypeSg.values()[randomIndex];

        CarSg carSg = null;

        switch (randomCarType) {

            case RENAULT:
                carSg = new Renault();

                break;

            case FIAT:
                carSg = new Fiat();

                break;
        }
        return carSg;

    }
}
