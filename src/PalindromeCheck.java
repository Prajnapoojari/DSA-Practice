import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String to check palindrome:");
        String input= sc.nextLine();
        String originalString= input.toLowerCase().replace(" ","");
        String reversedString="";
        for(int i=originalString.length()-1; i>=0; i--)
        {
            reversedString= reversedString+originalString.charAt(i);
        }
        if(originalString.equals(reversedString))
        {
            System.out.println("This String is Palindrome: " + originalString);
        }
        else {
            System.out.println("This String is not a Palindrome: " + originalString);
        }
    }
}
