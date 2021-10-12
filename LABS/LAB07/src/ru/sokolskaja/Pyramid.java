package ru.sokolskaja;

public class Pyramid extends Shape{
    private double sqare;
    private double height;

    public Pyramid(double sqare, double height) {
        this.sqare = sqare;
        this.height = height;
    }

    @Override
    public double getVolume() {
        this.volume = (this.sqare * this.height) / 3;
        return this.volume;
    }
}
