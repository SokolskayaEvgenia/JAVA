package ru.sokolskaja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 2, 8, 4, 5};
        int[] Array2 = {1, 2, 3, 1, 2, 4};
        /* 1.
        Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
        Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
         */
        isSortedAscending(Array);

        /* 2.
        Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
        затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
         */
        inputArray();

        /* 3.
        Напишите метод, который меняет местами первый и последний элемент массива.
         */
        System.out.println(Arrays.toString(swapArrayElements(Array)));

        /* 4.
        Дан массив чисел. Найдите первое уникальное в этом массиве число.
        Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
         */
        firstUniqueNumber(Array2);

        /* 5.
        Вычислить N-е число Фибоначчи. Не использовать рекурсию и массивы, только циклы.
         */
        System.out.println(fibonacciNumber(15));

        /* 6.
        Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
         */
        int[] randomArray = randomArray();
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(mergeSort(randomArray)));
        System.out.println(Arrays.toString(mergeSort(randomArray())));
    }

    public static void isSortedAscending(int[] array){
        boolean result = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("OK");
        }
        else {
            System.out.println("Please, try again");
        }
    }

    public static void inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static int[] swapArrayElements (int[] array) {
        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        newArray[newArray.length - 1] = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void firstUniqueNumber (int[] array) {
        Integer firstUnique = null;
        for (int i = 0; i < array.length; i++){
            boolean unique = true;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j] && j != i) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                firstUnique = array[i];
                break;
            }
        }
        if (firstUnique != null) {
            System.out.println("First unique value: " + firstUnique);
        }
        else {
            System.out.println("No unique values");
        }
    }

    public static long fibonacciNumber (int n) {
        long result = 0;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            long temp1 = 0;
            long temp2 = 1;
            for (int i = 2; i <= n; i++){
                result = temp1 + temp2;
                temp1 = temp2;
                temp2 = result;
            }
            return result;
        }
    }

    public static int[] randomArray(){
        int lenght = (int)(Math.random() * 11);
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++){
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

    private static int[] mergeSort(int[] input){
        if (input.length == 1)
            return input;

        int length = input.length/2;
        int[] left = new int[length];
        int[] right = new int[input.length - length];

        for (int i = 0; i < length; i++)
            left[i] = input[i];
        for (int i = length; i < input.length; i++)
            right[i-length] = input[i];

        return merge(mergeSort(left),mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length+right.length];
        int lengthLeft = left.length;
        int lengthRight = right.length;
        while (lengthLeft > 0 && lengthRight > 0){
            if (left[left.length - lengthLeft] < right[right.length - lengthRight]){
                merged[merged.length -lengthLeft-lengthRight] = left[left.length - lengthLeft];
                lengthLeft--;
            }else{
                merged[merged.length - lengthLeft-lengthRight] = right[right.length - lengthRight];
                lengthRight--;
            }
        }
        while (lengthLeft > 0){
            merged[merged.length - lengthLeft] = left[left.length-lengthLeft];
            lengthLeft--;
        }
        while (lengthRight > 0){
            merged[merged.length - lengthRight] = right[right.length-lengthRight];
            lengthRight--;
        }
        return merged;
    }
}
