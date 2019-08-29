package latihan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFutureCallback
 */
public class CompletableFutureCallback {

    public static void main(String[] args) {
        long started = System.currentTimeMillis();
        
        CompletableFuture<String> data = createCompletableFuture().thenApply((Integer count) -> {
            int transformedValue = count*10;
            return transformedValue;
        }).thenApply(transformed -> "Finally create a string: "+ transformed);

        try {
            System.out.println(data.get());
        } catch (InterruptedException | ExecutionException e) {
            //TODO: handle exception
        }
    }

    public static CompletableFuture<Integer> createCompletableFuture(){
        CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
            return 20;
        });
        return result;
    }
}