//step 7: create an interface & implement on at least 1 class
package com.bnta.interfaces;

public class Car implements Vehicle{

    private int speed;
    private int gear;

    public Car (int speed) {
        this.speed = speed;
    }

    public Car (String type, int size) {
        super(type, size);
    }

    public String getType() {
        return super.getType();
    }

    public int getSize () {
        return super.getSize();
    }

    public String sound() {
        return "zoom";
    }
}
