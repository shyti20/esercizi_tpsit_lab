package it.mo.itisvinci.ai.shytif20.progettoDipartimento;

import java.util.List;

public class Consumer extends Thread {
    private List<String> coda;
    private int counter;

    public Consumer(List<String> coda,  int counter) {
        this.coda = coda;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (coda) {
            try {
                coda.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        while (true) {
            synchronized (coda) {

                String out = coda.remove(coda.size() - 1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(out);

                try {
                    coda.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
