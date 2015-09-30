package org.academiadecodigo.carcrash.simpeGraphics;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by jlemos88 on 28/09/15.
 */
public class GameSg implements KeyboardHandler{

    public static final int NUMBER_CARS = 10;

    /**
     * Container of Cars
     */
    CarSg[] carsSg;

    public void init() {

        Keyboard k = new Keyboard(this);

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRight);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventUp);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventDown);


        MyCar myCar = new MyCar();


        carsSg = new CarSg[NUMBER_CARS];
        carsSg[0] = myCar;



        for (int i=1; i< NUMBER_CARS; i++) {
            carsSg[i] = CarFactorySg.getNewCarSg();
            //System.out.println(carsSg[i]);
        }

        move();

    }


    public void move() {

        while(true) {

            for (CarSg carSg : carsSg)
                if (!carSg.isCrashed()) {


                    checkColision(carSg);

                    carSg.move();

                }


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void checkColision(CarSg carSg){

        for (int i = 0; i < carsSg.length; i++) {
            if (carsSg[i].isCrashed()) {
                continue;
            }
            if (carSg != carsSg[i] && carSg.position.equalsPos(carsSg[i].position)) {
                carSg.crash();
                carsSg[i].crash();
            }
        }
    }





    @Override
    public void keyPressed(KeyboardEvent e) {
        switch (e.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                //System.out.println("Key Left pressed");
                carsSg[0].moveWest();
                break;

            case KeyboardEvent.KEY_RIGHT:
                //System.out.println("Key Right pressed");
                carsSg[0].moveEast();
                break;

            case KeyboardEvent.KEY_UP:
                //System.out.println("Key Up pressed");
                carsSg[0].moveNorth();
                break;

            case KeyboardEvent.KEY_DOWN:
                //System.out.println("Key Down pressed");
                carsSg[0].moveSouth();
                break;

            case KeyboardEvent.KEY_SPACE:
                //System.out.println("Key SPACE pressed");
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {

    }


}
