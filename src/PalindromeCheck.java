import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  to check palindrome:");
        String input= sc.nextLine();

        String reversed="";
        for(int i=input.length()-1; i>=0; i--)
        {
            reversed=reversed+input.charAt(i);
        }


        if(input.equals(reversed))

        {
            System.out.println("The number is a palindrome.");
        }
        else
        {
            System.out.println("The number is not a palindrome.");
        }

    }
}
