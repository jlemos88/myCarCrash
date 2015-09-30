package org.academiadecodigo.carcrash.simpeGraphics;

/**
 * Created by jlemos88 on 28/09/15.
 */
public enum DirectionSg {

    NORTH,
    SOUTH,
    WEST,
    EAST;



    public static DirectionSg randomDir() {
        int i = (int)(Math.random() * DirectionSg.values().length);
        DirectionSg result;

        switch (i) {
            case 0:
                result = NORTH;
                break;

            case 1:
                result = SOUTH;
                break;

            case 2:
                result = WEST;
                break;

            case 3:
                result = EAST;
                break;
            default:
                result = NORTH;
                break;
        }

        return result;
    }






}
