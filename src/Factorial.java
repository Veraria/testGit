
import java.util.Scanner;

public class Factorial {
    //recursive method

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]){
        String name = "Verica";
        System.out.println(String.format("Welcome %s",name));
        System.out.println("Input one number");
        System.out.println("Input one number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

            System.out.println("Factorial of " + n + " is: " + factorial(n));

    }
}

