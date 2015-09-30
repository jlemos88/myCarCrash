package org.academiadecodigo.carcrash.cars;

/**
 * Created by jlemos88 on 23/09/15.
 */
public enum CarType {
    ASTONMARTIN("A"),
    FIAT("F");

    private String symbol;

    private CarType(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }

}

