import java.util.Scanner;

public class ThirdLargest {
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
        int L=0, sl=0, tl=0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]>L)
            {
                tl=sl;
                sl=L;
                L=arr[i];


            }
            else if(arr[i]>sl && arr[i]!=L)
            {
                tl=sl;
                sl=arr[i];

            }
            else if(arr[i]>tl && arr[i]!=sl && arr[i]!=L)
            {
                tl=arr[i];
            }

        }
        System.out.println("Third Largest Element is: "+tl);
    }
}
