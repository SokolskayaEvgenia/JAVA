package ru.sokolskaja;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{500,250}, {700,300}, {900,350}};
        System.out.println("Task 1");
        System.out.println(SearchMax(array));
        System.out.println("Task 2");
        System.out.println(isSquareCheck(array));
        System.out.println("Task 3");
        System.out.println("Line where sum is max - " + MaxSum(array));
        System.out.println("Task 4");
        char[][] chars = fillChars(3,6);
        for (int i = 0; i < chars.length; i++)
        {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }


    }


    public static int SearchMax(int[][] array)
    {
        int a = 0;
        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j <array[i].length; j ++)
            {
                if (array[i][j]>a)
                {
                    try
                    {
                        a = array[i][j];
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error");
                    }
                }
            }
        }
        return a;
    }

    public static String isSquareCheck(int[][] array)
    {
        int a = 0;
        int b = 0;
        for (int i = 0; i<array.length; i++)
        {
            a = i;
            for (int j = 0; j <array[i].length; j ++)
            {
                b = j;
            }
        }
        if (a == b)
        {
            return "Array is square";
        }
        else
        {
            return "Array is not square";
        }
    }

    public static int MaxSum (int[][] array)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j <array[i].length; j ++)
            {
                a += array[i][j];

            }
            if (a > b)
            {
                b = a;
                a = 0;
                c = i;
            }

        }
        return c;
    }

    public static char[][] fillChars (int m, int n) {
        char[][] chars = new char[m][n];
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                chars[i][j] = (char) ('a' + Math.random() * 26);
            }
        }
        return chars;
    }

       }


