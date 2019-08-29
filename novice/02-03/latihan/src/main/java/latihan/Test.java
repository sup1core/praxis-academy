package latihan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Test
 */
public class Test {

    private static final int NTHREDS = 10;
    
    public static void main(String[] args) {
        final CounterNonBlockng counternonblockng = new CounterNonBlockng();
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i=0; i<500; i++){
            Callable<Integer> worker = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception{
                    int number = counternonblockng.increment();
                    System.out.println(number);
                    return number;
                }
            };

            Future<Integer> submit= executor.submit(worker);
            list.add(submit);
        }

        //this will make the executor accept to no new threads
        executor.shutdown();

        //wait until all threads are finish
        while (!executor.isTerminated()) {
            //
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Future<Integer> future : list){
            try {
                set.add(future.get());
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        if (list.size()!=set.size()) {
            throw new RuntimeException("Double-entries !!!");
        }
    }
}