import java.util.Scanner;

public class Factorial {
    // Using recursion
    static int factorialUsingRecursion(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * factorialUsingRecursion(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        // using loop
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        System.out.println("The factorial of " + number + " is: " + factorialUsingRecursion(number));
        sc.close();


    }
}
