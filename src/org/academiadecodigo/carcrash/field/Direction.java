package org.academiadecodigo.carcrash.field;

/**
 * Created by jlemos88 on 24/09/15.
 */
public enum Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    public static Direction randomDir() {
        int i = (int)(Math.random() * Direction.values().length);
        Direction result;

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
