import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong or not: ");
        int number= sc.nextInt();
        int originalNumber= number;
        int result=0;
        while (number!=0)
        {
            int digit= number%10;
            result+= digit*digit*digit;
            number= number/10;
        }
        if(result==originalNumber)
        {
            System.out.println("This number is Armstrong:"+ originalNumber);
        }
        else {
            System.out.println("This number is not a Armstrong:"+ originalNumber);
        }
        sc.close();
    }
}
