package ru.sokolskaja;

public class Main {

    public static void main(String[] args) {
        // 1. Абстрактные классы
        System.out.println("Task 1");
        Human client = new Client("Анна", "Николаева", "ВТБ");
        client.show();
        Human employee = new Employee("Петр", "Васечкин", "Альфа-банк");
        employee.show();

        // 2. изменить иерархию shapes (использовать абстрактные классы, где возможно)
        // 3. заменить класс Shape на интерфейс Shape.
        System.out.println("Task 2, Task 3");
        Box box = new Box(150);
        Shape pyramid = new Pyramid(8,3);
        System.out.println(box.add(pyramid));
        Shape cylinder = new Cylinder(2,3);
        System.out.println(box.add(cylinder));
        Shape ball = new Ball(6);
        Shape pyramid2 = new Pyramid(10,10);
        System.out.println(box.add(pyramid2));
        System.out.println(box.add(ball));
        System.out.println("В коробке: ");
        box.showBox();
    }
}
