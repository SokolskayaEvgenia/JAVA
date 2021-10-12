package ru.sokolskaja;

public class Main {

    public static void main(String[] args) {

        // 1. Class Truck extends class Car
        System.out.println("Task 1");
        Truck truck = new Truck(18000, "MERCEDES-BENZ ACTROS 4160", 'b', 85.0f, 8, 48000);
        truck.outPut();
        truck.newWheels(12);

        // 2. Реализовать иерархию классов
        System.out.println("Task 2");
        Box box = new Box(30);
        Pyramid pyramid = new Pyramid(4,2);
        System.out.println(box.add(pyramid));
        Cylinder cylinder = new Cylinder(1,3);
        System.out.println(box.add(cylinder));
        Ball ball = new Ball(4);
        System.out.println(box.add(ball));
        System.out.println("В коробке: ");
        box.showBox();

    }
}
