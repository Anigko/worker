package ru.netology.ak1;

public class Main {

    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskFailedListener listener2 = System.out::println;

        Worker worker = new Worker(listener, listener2);
        worker.start();

    }
}
