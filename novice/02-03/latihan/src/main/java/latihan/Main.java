package latihan;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 * @author Supi Core - August 28, 2019
 */
public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();

        for (int i=0;i<500;i++){
            Runnable task = new MyRunnable(100000L+i);
            Thread worker = new Thread(task);

            //we can set the name of the thread
            worker.setName(String.valueOf(i));

            //Start the threa, never all method run() direct
            worker.start();

            //Remember the thread for later usage
            threads.add(worker);
        }
        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have "+running+" running thread.");
        } while (running>0);
    }
}