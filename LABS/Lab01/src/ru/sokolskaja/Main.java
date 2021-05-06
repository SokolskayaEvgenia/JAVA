package ru.sokolskaja;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
        System.out.println();
        System.out.println("Задание 2");
        int res = (46 + 10) * (10 / 3);
        System.out.println("(46 + 10) * (10 / 3) = " + res);
        res = (29) * (4) * (-15);
        System.out.println("(29) * (4) * (-15) = " + res);
        System.out.println();
        System.out.println("Задание 3");
        int number = 10500;
        int res2 = (number / 10) / 10;
        System.out.println(res2);
        System.out.println();
        System.out.println("Задание 4");
        double a = 3.6;
        double z = 4.1;
        double c = 5.9;
        double result = a * z * c;
        System.out.println(result);
        System.out.println();
        System.out.println("Задание 5");
        Scanner in = new Scanner(System.in);
        System.out.println("Number 1: ");
        int d = in.nextInt();
        System.out.println("Number 2: ");
        int e = in.nextInt();
        System.out.println("Number 3: ");
        int f = in.nextInt();
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println();
        System.out.println("Задание 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        if (b % 2 > 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
