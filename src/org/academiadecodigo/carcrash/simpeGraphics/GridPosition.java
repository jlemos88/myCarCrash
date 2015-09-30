package org.academiadecodigo.carcrash.simpeGraphics;


/**
 * Created by jlemos88 on 28/09/15.
 */
public class GridPosition {



    int x;
    int y;



    GridPosition(int x, int y) {

        this.x = x;
        this.y = y;


    }

    public boolean equalsPos(GridPosition position) {
        if (this.x == position.x && this.y == position.y){
            return true;
        }
        return false;
    }



}
