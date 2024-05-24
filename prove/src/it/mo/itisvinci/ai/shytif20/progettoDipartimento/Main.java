package it.mo.itisvinci.ai.shytif20.progettoDipartimento;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> coda = new LinkedList<>();

        Consumer consumer = new Consumer(coda, 0);
        Producer producer = new Producer(coda, 0);
        
        producer.start();
        consumer.start();

        consumer.join();
        producer.join();

    }
}