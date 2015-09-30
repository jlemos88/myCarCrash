package org.academiadecodigo.carcrash.simpeGraphics;


import org.academiadecodigo.simplegraphics.graphics.Picture;


/**
 * Created by jlemos88 on 28/09/15.
 */
public class Renault extends CarSg{

    public Renault() {
        super();
        carTypeSg = CarTypeSg.RENAULT;
        pic = new Picture(position.x * GfxField.cellSizeX, position.y * GfxField.cellSizeY, "resources/car_orange.png");
        pic.draw();
        speed = 2;

    }


}
