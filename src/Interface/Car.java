package Interface;

import sun.awt.geom.AreaOp;

public class Car implements Engine,Brake{

    public void brake() {
        System.out.println("I brake like a normal car");
    }


    public void start() {
        System.out.println("I start like a normal car");
    }


    public void stop() {
        System.out.println("I Brake a normal car");
    }


    public void acc() {
        System.out.println("I accelrate the normal car");
    }
}
