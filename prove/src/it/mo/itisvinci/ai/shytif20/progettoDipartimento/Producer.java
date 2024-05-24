package it.mo.itisvinci.ai.shytif20.progettoDipartimento;

import java.util.List;
import java.util.Scanner;

public class Producer extends Thread {
    private List<String> coda;
    private Integer counter;

    public Producer(List<String> coda, Integer counter) {
        this.coda = coda;
        this.counter = counter;
    }

    @Override
    public void run() {
        Scanner kb = new Scanner(System.in);

        while (true) {
            String str = kb.nextLine();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            coda.add(str);
            synchronized (coda) {
                coda.notify();
            }
        }
    }
}
