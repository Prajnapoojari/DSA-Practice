import java.util.Scanner;

public class sumofitsdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int input=sc.nextInt();
        int sum=1;
        while(input!=0)
        {
            int digits=input%10;
            sum=sum*digits;
            input=input/10;
        }
        System.out.println(sum);
    }
}
