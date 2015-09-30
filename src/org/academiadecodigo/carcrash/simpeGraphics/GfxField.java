package org.academiadecodigo.carcrash.simpeGraphics;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by jlemos88 on 28/09/15.
 */
public class GfxField {

    // Field size
    public static int width() {return numberCols * cellSizeY;}
    public static int height() {return numberRows * cellSizeX;}

    // number of collumns and rows
    public static int numberCols = 70;
    public static int numberRows = 30;

    // Cell size
    public static int cellSizeX = 15;

    public static int cellSizeY = 15;


    public void test() throws InterruptedException {

        Rectangle canvas = new Rectangle(0 , 0, width(), height());
        canvas.setColor(Color.BLACK);
        canvas.fill();

    }



}
