package org.academiadecodigo.carcrash.simpeGraphics;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by jlemos88 on 28/09/15.
 */
abstract public class CarSg {

    GridPosition position;
    CarTypeSg carTypeSg;
    DirectionSg directionSg;
    Picture pic;
    boolean isCrashed;

    int speed;



    public CarTypeSg getCarTypeSg() {
        return carTypeSg;
    }



    public CarSg(){

        int randomX = (int)(Math.random() * GfxField.numberCols);
        int randomY = (int)(Math.random() * GfxField.numberRows);

        position = new GridPosition(randomX,randomY);
        directionSg = DirectionSg.NORTH;


    }



    public void move() {


        randomChoice();

        for (int i = 0; i < speed; i++) {
            switch (directionSg) {

                case NORTH:
                    moveNorth();
                    break;

                case SOUTH:
                    moveSouth();
                    break;

                case WEST:
                    moveWest();
                    break;

                case EAST:

                   moveEast();
                    break;
            }
        }
    }

    public void randomChoice() {
        double randomChange = Math.random();

        if (randomChange < 0.25) {
            directionSg = DirectionSg.randomDir();
        }
    }

    public void moveNorth() {

        if (position.y > 0) {
            //move north
            pic.translate(0, - GfxField.cellSizeY);
            position.y -= 1;
        } else {
            DirectionSg.randomDir();
        }
    }

    public void moveSouth() {

        if (position.y < GfxField.numberRows - 1) {
            //move south
            pic.translate(0, GfxField.cellSizeY);
            position.y += 1;
        } else {
            DirectionSg.randomDir();
        }
    }

    public void moveWest() {

        if (position.x > 0) {
            // move west
            pic.translate(- GfxField.cellSizeX, 0);
            position.x -= 1;
        } else {
            DirectionSg.randomDir();
        }
    }

    public void moveEast() {

        if (position.x < GfxField.numberCols - 1) {
            // move east
            pic.translate(+ GfxField.cellSizeX, 0);
            position.x += 1;
        } else {
            DirectionSg.randomDir();
        }
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void crash() {
        isCrashed = true;
        pic.delete();
        System.out.print("Crashei.\n");
    }

    @Override
    public String toString() {
        return "CarSg{" +
                "position=" + position +
                ", carTypeSg=" + carTypeSg +
                ", directionSg=" + directionSg +
                ", pic=" + pic +
                ", isCrashed=" + isCrashed +
                ", speed=" + speed +
                '}';
    }
}



