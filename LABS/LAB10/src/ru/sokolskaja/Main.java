package ru.sokolskaja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Task 1");
        List<String> strings = new ArrayList<>();
        strings.add("яблоко");
        strings.add("банан");
        strings.add("груша");
        strings.add("банан");
        uniqueCollection(strings).forEach(System.out::println);

        System.out.println("Task 2");
        List<Integer> list1 = new ArrayList<>();
        fillMillionElements(list1);
        List<Integer> list2 = new LinkedList<>();
        fillMillionElements(list2);
        //LinkedList работает дольше, т.к. на каждую вставку создает новый узел

        System.out.println("Task 3");
        Map<User, Integer> usersToScore = new HashMap<>();
        usersToScore.put(new User("Николай"), 17);
        usersToScore.put(new User("Анна"), 21);
        usersToScore.put(new User("Илья"), 20);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String inputName = bf.readLine();
        User inputUser = new User(inputName);
        Integer score = usersToScore.get(inputUser);
        if (score != null) {
            System.out.println("У вас " +  score +" очков");
        }
        else {
            System.out.println("Данный пользователь не играл");
        }

        System.out.println("Task 4");
        String[] strings1 = strings.toArray(new String[4]);
        arrayToMap(strings1)
                .forEach((s, integer) -> System.out.println("Слово " + s + " встречается " + integer + " раз"));
    }

    //1.
    public static Set<Object> uniqueCollection (Collection<? extends Object> collection) {
        return new HashSet<>(collection);
    }

    //2.
    public static void fillMillionElements (List<Integer> list) {
        long start = System.nanoTime();
        for(int i = 0; i < 1000000; i++) {
            Integer j = (int) (Math.random() * 10);
            list.add(j);
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Время выполнения: " + time / 1000 + "мс.");
    }

    //4.
    public static  <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> result = new HashMap<>();
        for (K k : ks) {
            if (result.get(k) != null) {
                int t = result.get(k);
                result.put(k, ++t);
            }
            else {
                result.put(k, 1);
            }
        }
        return result;
    }

}
