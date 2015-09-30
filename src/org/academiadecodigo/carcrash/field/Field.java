package org.academiadecodigo.carcrash.field;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenWriter;
import com.googlecode.lanterna.terminal.Terminal;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarType;

import java.awt.*;

public final class Field {

    public static int width;
    public static int height;

    // Used to write to screen
    private static Screen screen;

    // Screen wrapper that preserves default options
    private static ScreenWriter screenWriter;

    //This class is not supposed to be instantiated
    private Field() {
    }

    /**
     * Initializes the Screen
     * @param width screen width
     * @param height screen height
     */
    public static void init(int width, int height) {

        // Create the GUI
        screen = TerminalFacade.createScreen();


        // Set field size
        Field.width = width;
        Field.height = height;
        screen.getTerminal().setCursorVisible(false); // Not Working
        screen.getTerminal().getTerminalSize().setColumns(width);
        screen.getTerminal().getTerminalSize().setRows(height);

        // Default screen writing options
        screenWriter = new ScreenWriter(screen);
        screenWriter.setBackgroundColor(Terminal.Color.BLUE);
        screenWriter.setForegroundColor(Terminal.Color.WHITE);

        screen.startScreen();

    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    /**
     * Displays a group of cars in the screen
     * @param cars an array of cars
     */
    public static void draw(Car[] cars) {



        screen.clear();

        for (Car c : cars) {

            if (!c.isCrashed()) {
                switch (c.getCarType()){
                    case ASTONMARTIN:
                        screenWriter.setBackgroundColor(Terminal.Color.GREEN);
                        break;

                    case FIAT:
                        screenWriter.setBackgroundColor(Terminal.Color.CYAN);
                        break;
                }
                screenWriter.drawString(c.getPos().getCol(), c.getPos().getRow(), c.toString());

            }


        }

        screen.refresh();

    }

}