package ru.sokolskaja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 1. Написать метод для поиска самой длинной строки.*/
        System.out.println("Task 1");
        String[] words = {"Люблю грозу в начале мая", "Когда весенний", "первый гром", "как бы резвяся и играя", "Грохочет в небе голубом"};
        System.out.print("Самая длинная строка: " + the_longest_string(words));
        System.out.println();

        /* 2. Написать метод, который проверяет является ли слово палиндромом.*/

        System.out.println("Task 2");
        palindrome_check();
        System.out.println();

        /* 3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».*/
        System.out.println("Task 3");
        censored();
        System.out.println();

        /* 4. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.*/

        System.out.println("Task 4");
        String str1 = "Пух посмотрел на небо, а потом, снова услышав чей-то свист, " +
                "взглянул на большой дуб и увидел кого-то на ветке.";
        String str2 = "на";
        System.out.println("1: " + str1);
        System.out.println("2: " + str2);
        System.out.println(countString(str1, str2) + " вхождения");
        System.out.println();

        /* 5. Напишите метод, который инвертирует слова в строке.
        Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.*/

        System.out.println("Task 5");
        String testString = "This is a test string";
        System.out.println(testString);
        System.out.println(reverseString(testString));
        System.out.println();
    }

    private static String the_longest_string(String[] array) {
        int arr_length = 0;
        String arr_value = "0";
        for (int i = 0; i < array.length; i++) {
            if (arr_length < array[i].length()) {
                arr_length = array[i].length();
                arr_value = array[i];
            }
        }
        return arr_value;
    }

    private static void palindrome_check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.next();

        if (word.length() % 2 == 0) {
            if (word.substring(0, (word.length() / 2)).equals((new StringBuilder(word.substring((word.length() / 2), word.length())).reverse()).toString())) {
                System.out.print("Это слово - палиндром");
            } else {
                System.out.print("Это слово - не палиндром");
            }
        }
        if (word.length() % 2 != 0) {
            if (word.substring(0, ((word.length() - 1) / 2)).equals((new StringBuilder(word.substring(((word.length() + 1) / 2), word.length())).reverse()).toString())) {
                System.out.print("Это слово - палиндром");
            } else {
                System.out.print("Это слово - не палиндром");
            }
        }

    }

    private static void censored() {
        String text = "— Нет, не думаю,— сказал Пух,— потому что следы совсем другие... Это, может быть, два Буки, а один, скажем... скажем, Бяка... Надо идти за ними, ничего не поделаешь.";
        String find = "Бяка";
        int index = text.indexOf(find);
        StringBuilder text_new = new StringBuilder(text);
        while (index != -1) {
            text_new.replace(index, index + find.length(), "[вырезано цензурой]");
            index = text_new.toString().indexOf("Бяка");
        }
        System.out.println(text_new.toString());

    }

    private static int countString(String str, String subStr) {
        int count = 0;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(subStr.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    private static String reverseString(String str) {
        StringBuilder reverseStr = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reverseStr.append(sb.reverse());
            reverseStr.append(" ");
        }
        return reverseStr.toString();
    }
}
