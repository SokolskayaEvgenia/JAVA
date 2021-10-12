package ru.sokolskaja;

import java.time.LocalDate;

public class House {
    private int floors;
    private int year;
    private String name;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setHouse(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public int ageOfHouse() {
        LocalDate date = LocalDate.now();
        int yearNow = date.getYear();
        return yearNow - this.year;
    }

    @Override
    public String toString() {
        return "количество этажей: " + floors +
                ", год постройки: " + year +
                ", наименование: " + name;
    }
}
