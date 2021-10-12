package ru.sokolskaja;

public class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println(this.getState());
    }
}
