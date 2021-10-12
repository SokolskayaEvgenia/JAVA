package ru.sokolskaja;

public class Client extends Human{
    private String bankName;
    public Client(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void show() {
        System.out.println(this.getName() + " " + this.getLastName() +
                " является клиентом банка: " + this.bankName + ".");
    }
}
