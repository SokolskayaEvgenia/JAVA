package ru.sokolskaja;

public class Employee extends Human{
    private String bankName;

    public Employee(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void show() {
        System.out.println(this.getName() + " " + this.getLastName() +
                " является сотрудником банка: " + this.bankName + ".");
    }
}
