import java.util.Scanner;

/**
 * Exponents
 */
public class Exponents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exponents Calculator");
        System.out.println("====================");

        System.out.println("Enter the base name :");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the exponent :");
        int b = Integer.parseInt(scanner.nextLine());

        int result = a;
        for (int i=0; i < (b-1); i++){
            result = a*result;
        }

        System.out.println("Result "+ result);
        System.out.println("Thanks !");
    }
}