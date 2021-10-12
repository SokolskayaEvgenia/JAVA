package ru.sokolskaja;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        this.volume =  4.0 / 3 * Math.PI * Math.pow(this.getRadius(), 3);
        return this.volume;
    }
}
