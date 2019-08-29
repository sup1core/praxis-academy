package latihan;

import java.util.concurrent.Callable;

/**
 * MyCallable
 */
public class MyCallable implements Callable <Long>{
    @Override
    public Long call() throws Exception{
        long sum = 0;
        for (long i=0; i<=100; i++){
            sum +=1;
        }
        return sum;
    }
}