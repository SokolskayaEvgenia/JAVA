package ru.sokolskaja;

import java.util.ArrayList;

public class Box implements Shape{
    private double volume;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box( double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (this.volume >= shape.getVolume()) {
            shapes.add(shape);
            this.volume -= shape.getVolume();
            return true;
        }
        else {
            return false;
        }
    }

    public void showBox() {
        for (Shape s : shapes) {
            System.out.print(s.getClass().getSimpleName() + " объемом " + s.getVolume() + " ");
        }
    }

    @Override
    public double getVolume() {
        return this.volume;
    }
}
