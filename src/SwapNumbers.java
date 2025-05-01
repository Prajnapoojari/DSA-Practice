import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber= sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber= sc.nextInt();
        // Before Swapping
        System.out.println("Before swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
         firstNumber=firstNumber+secondNumber;
         secondNumber=firstNumber-secondNumber;
        firstNumber=firstNumber-secondNumber;
        // After Swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
