package latihan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFutureSimpleSnippet
 */
public class CompletableFutureSimpleSnippet {

    public static void main(String[] args) {
        long started = System.currentTimeMillis();

        //configure CompletetableFuture
        CompletableFuture<Integer> futureCount = createCompletableFuture();

        //continue to do other work
        System.out.println("Took "+(started - System.currentTimeMillis())+" milliseconds");

        //now its time to get the result
        try {
            int count = futureCount.get();
            System.out.println("CompletableFuture took "+ (started - System.currentTimeMillis())+" miliseconds");
            System.out.println("Result "+count);
        } catch (InterruptedException | ExecutionException ex) {
        
        }
    }

    private static CompletableFuture<Integer> createCompletableFuture() {
        CompletableFuture<Integer> futureCount = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        // simulate long running task
                        Thread.sleep(5000);
                    } catch (InterruptedException e) { }
                    return 20;
                });
        return futureCount;
    }


}