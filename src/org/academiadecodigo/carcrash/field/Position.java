package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Game;
import org.academiadecodigo.carcrash.cars.Car;

public class Position {


    private int col;
    private int row;


    public Position() {
        this.col = (int)(Math.random() * Field.getWidth());
        this.row = (int)(Math.random() * Field.getHeight());
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void move(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public boolean equals(Position position) {
        if (this.col == position.getCol() && this.row == position.getRow()){
            return true;
        } else {
            return false;
        }
    }
}
