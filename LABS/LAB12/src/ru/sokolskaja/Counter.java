package ru.sokolskaja;

public class Counter {
    volatile int count = 0;
    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}
