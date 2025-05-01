import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not: ");
        int number= sc.nextInt();
        boolean isPrime=true;
        if(number<=1) {
            isPrime = false;
        }
        else
        {
            for(int i=2; i<=number-1; i++)
            {
                if(number%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("This number is Prime:"+ number);
        }
        else {
            System.out.println("This number is not a Prime:"+ number);
        }
        sc.close();
    }
}
