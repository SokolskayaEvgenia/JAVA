package ru.sokolskaja;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //1.
//        for (int i = 0; i < 10; i++) {
//            new MyThread().start();
//        }
        //2.
        Thread thread = new MyThread2();
        System.out.println(thread.getState()); //состояние потока перед запуском
        thread.start(); // во время выполнения
        //Thread.sleep(1000);
        System.out.println(thread.getState()); // после запуска

        //3.
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            new CounterThread(counter).start();
        }
        Thread.sleep(1000);
        System.out.println(counter.count);

        //4.
        Object lock = new Object();
        Thread thread1 = new MyRunnable(lock);
        Thread thread2 = new MyRunnable(lock);
        thread1.start();
        thread2.start();
    }
}
