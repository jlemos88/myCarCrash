package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Grid;
import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {


    /** The position of the car on the grid */
    Position pos;
    boolean isCrashed;
    Direction direction;
    Grid grid;

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    int speed;

    CarType carType;

    public CarType getCarType() {
        return carType;
    }

    public Car() {
        pos = new Position();
        this.speed = speed;
        direction = Direction.NORTH;
    }

    public void move() {

        double randomChange = Math.random();

        if (randomChange < 0.25) {
            direction = Direction.randomDir();
        }



        for (int i = 0; i < speed; i++) {
            switch (direction) {

                case NORTH:
                    // going north
                    if (getPos().getRow() >= 1) {
                        //move north
                        getPos().move(getPos().getCol(), getPos().getRow() - 1);
                    } else {
                        move();
                    }
                    break;

                case SOUTH:
                    //going south
                    if (getPos().getRow() < Field.getHeight() - 1) {
                        //move south
                        getPos().move(getPos().getCol(), getPos().getRow() + 1);
                    } else {
                        move();
                    }
                    break;

                case WEST:
                    //going west
                    if (getPos().getCol() >= 1) {
                        // move west
                        getPos().move(getPos().getCol() - 1, getPos().getRow());
                    } else {
                        move();
                    }
                    break;

                case EAST:

                    // going east
                    if (getPos().getCol() < Field.getWidth() - 1) {
                        // move east
                        getPos().move(getPos().getCol() + 1, getPos().getRow());
                    } else {
                        move();
                    }
                    break;
            }
            if(!grid.isEmpty(getPos(), this)) {
                for(Car car : grid.getCarsAt(getPos())) {
                    car.crash();
                }

            }
        }

    }



    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void crash() {
        isCrashed = true;
        getPos().move(-1,-1);
        System.out.print("Crashei.\n");
    }
}
