package ru.sokolskaja;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*System.out.println("Task 1");
        taskOne();
        System.out.println();
        System.out.println("Task 2");
        taskTwo();
        System.out.println();
        System.out.println("Task 3");
        taskThree();
        System.out.println();
        System.out.println("Task 4");
        taskFour();
        System.out.println();*/
        System.out.println("Task 5_6");
        taskFive_Six();

    }

    //Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
    public static void taskOne () {
        for (int i = 1; i <= 99; i+=2 ){
            System.out.println(i);
        }
    }
    //Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
    public static void taskTwo() {
        System.out.print("Делится на 3: ");
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int j = 1; j <=100; j++){
            if(j%5==0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.print("Делится на 3 и 5: ");
        for (int k = 1; k <=100; k++){
            if(k%5==0 && k%3==0) {
                System.out.print(k + " ");
            }
        }
    }

    //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
    public static void taskThree() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = input.nextInt();
        System.out.println("Введите второе число: ");
        int b = input.nextInt();
        System.out.println("Введите третье число: ");
        int c = input.nextInt();
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        System.out.println("Третье число: " + c);
        System.out.println("Результат: " + ((a+b)==c));
    }

    //Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
    public static void taskFour() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = input.nextInt();
        System.out.println("Введите второе число: ");
        int b = input.nextInt();
        System.out.println("Введите третье число: ");
        int c = input.nextInt();
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        System.out.println("Третье число: " + c);
        System.out.println("Результат: " + ((b>a)&&(c>b)));
    }

    //Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум.
    //Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
    public static void taskFive_Six() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива (больше или равен 2): ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
            }
        System.out.println("Задан массив: " + Arrays.toString(numbers));
        System.out.println(numbers[0]==3 || numbers[size-1]==3);
        System.out.println(Arrays.stream(numbers).anyMatch(x->x==1) || Arrays.stream(numbers).anyMatch(x->x==3) ) ;
        }

    }





