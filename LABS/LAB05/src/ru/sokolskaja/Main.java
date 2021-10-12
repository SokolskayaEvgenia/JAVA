package ru.sokolskaja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vector Vector1 = new Vector(-6, -4, 8);
        Vector Vector2 = new Vector(12, -3, 5);

        System.out.println("Длина вектора 1: " + Vector1.lenVector());
        System.out.println("Длина вектора 2: " + Vector2.lenVector());
        System.out.println("Скалярное произведение векторов: " + Vector1.scalar(Vector2));
        System.out.println("Векторное произведение дает вектор с координатами: " + Vector1.vectorMulti(Vector2));
        System.out.println("Косинус угла между векторами: " + Vector1.cosVector(Vector2));
        System.out.println("Сложение векторов дает вектор с координатами: " + Vector1.sum(Vector2));
        System.out.println("Вычитание векторов дает вектор с координатами: " + Vector1.diff(Vector2));

        System.out.println("Введите число N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Массив случайных векторов размером " + n + ": ");
        Vector[] arrVector = Vector.massVector(n);
        for (int i = 0; i < arrVector.length; i++) {
            System.out.println(arrVector[i]);
        }
    }
}
