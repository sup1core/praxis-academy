package javafunctionalfromjenkov;

/**
 * CalculatorExternalState
 */
public class CalculatorExternalState {

    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }
}