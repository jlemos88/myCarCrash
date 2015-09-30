package org.academiadecodigo.carcrash.simpeGraphics;


import org.academiadecodigo.simplegraphics.graphics.Picture;



/**
 * Created by jlemos88 on 29/09/15.
 */
public class MyCar extends CarSg {

    public MyCar(){
        super();
        pic = new Picture(position.x * GfxField.cellSizeX, position.y * GfxField.cellSizeY, "resources/car_blue.png");
        pic.draw();
    }


}
