package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by jlemos88 on 23/09/15.
 */
public class Fiat extends Car{

    public Fiat() {
        carType = CarType.FIAT;
        speed = 1;
    }

    @Override
    public String toString() {
        return CarType.FIAT.getSymbol();



    }
}
