package ru.sokolskaja;

public class Main {

    public static void main(String[] args) {
        //1. Class Study
        System.out.println("Task 1");
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println();

        //2. Class House
        System.out.println("Task 2");
        House house1 = new House();
        house1.setFloors(7);
        house1.setYear(1957);
        house1.setName("Сталлинка");
        System.out.println("Характеристики дома: " +
                "количество этажей: " + house1.getFloors() +
                ", год постройки: " + house1.getYear() +
                ", наименование: " + house1.getName() +
                ". Количество лет с момента постройки: " + house1.ageOfHouse());
        House house2 = new House();
        house2.setHouse(5, 1963, "ОД-6");
        System.out.println("Характеристики дома: " + house2.toString() +
                ". Количество лет с момента постройки: " + house2.ageOfHouse());
        System.out.println();

        //3. Class Tree
        System.out.println("Task 3");
        Tree tree1 = new Tree(4700, "Сосна долговечная");
        Tree tree2 = new Tree(400, true, "Дуб");
        Tree tree3 = new Tree();
        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println();

        //4. Class Airplane
        System.out.println("Task 4");
        Airplane a1 = new Airplane();
        Airplane.Wing w1 = a1.new Wing();
        w1.setWeight(43);
        Airplane a2 = new Airplane();
        Airplane.Wing w2 = a2.new Wing();
        w2.setWeight(250);
        System.out.println("Крыло первого самолета весит: " + w1.getWeight() + " т. " +
                "Крыло второго самолета весит: " + w2.getWeight() + " т.");
    }
}
