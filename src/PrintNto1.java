import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int ans=0;
        while(n!=0)
        {
           int digits=n%10;
           ans=ans*10+digits;
           n=n/10;
        }

        System.out.println(ans);


    }
}
