package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Game;

/**
 * Created by jlemos88 on 23/09/15.
 */
public class AstonMartin extends Car{

    public AstonMartin() {
        carType = CarType.ASTONMARTIN;
        speed = 2;
    }

    @Override
    public String toString() {
        return CarType.ASTONMARTIN.getSymbol();

    }
}
