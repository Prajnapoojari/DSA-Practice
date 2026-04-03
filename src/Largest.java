import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int arr [] =new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        int L=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>L)
            {
                L=arr[i];
            }
        }
        System.out.println("Largest Element is: "+L);


    }
}
