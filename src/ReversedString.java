import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String to reverse:");
        String originalString= sc.nextLine();
        String reversedString="";
        for(int i=originalString.length()-1; i>=0; i--)
        {
            reversedString= reversedString+originalString.charAt(i);
        }
        System.out.println("Reversed String is: " + reversedString);
    }
}
