package ru.sokolskaja;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        this.volume = Math.PI * this.getRadius() * this.getRadius() * height;
        return this.volume;
    }
}
