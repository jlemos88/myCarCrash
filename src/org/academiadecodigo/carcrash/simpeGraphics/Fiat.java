package org.academiadecodigo.carcrash.simpeGraphics;


import org.academiadecodigo.simplegraphics.graphics.Picture;


/**
 * Created by jlemos88 on 28/09/15.
 */
public class Fiat extends CarSg {

    public Fiat() {
        super();
        carTypeSg = CarTypeSg.FIAT;
        pic = new Picture(position.x * GfxField.cellSizeX, position.y * GfxField.cellSizeY, "resources/car_white.png");
        pic.draw();

        speed = 1;
    }

}
