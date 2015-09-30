package org.academiadecodigo.carcrash;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Game g = new Game(100, 25, 200);

        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation


/**
        Rectangle aston = new Rectangle(0, 0, 20, 20);
        Rectangle fiat = new Rectangle(0,0,20,20);

        GfxField gfxField = new GfxField();

        gfxField.test();


 */


    }


}
