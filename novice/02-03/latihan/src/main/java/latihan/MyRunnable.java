package latihan;

/**
 * MyRunnable
 * @author Supi Core - August 28, 2019
 */
public class MyRunnable implements Runnable{
    private final long countUntil;

    MyRunnable (long countUntil){
        this.countUntil=countUntil;
    }

    @Override
    public void run (){
        long sum = 0;
        for (long i=1; i < countUntil; i++){
            sum +=1;
        }
        System.out.println(sum);
    }
}