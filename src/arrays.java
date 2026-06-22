import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr=new int[size];


        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        //sum of array
        int sum=0;
        for(int i=0; i<size; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);

        //max element of array
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element of the array is:"+max);

        //min element of array
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max>arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum element of the array is:"+max);

        //Average of the arry

        int average=sum/arr.length;
        System.out.println("Average of the array:"+average);

        //reverse the array
        for(int i=0, j=arr.length-1; i<j; i++,j--)
        {
            int temp=arr[0];
            arr[i]=arr[j];
            arr[j]=temp;

        }
            System.out.println("Array Revesrsed:"+Arrays.toString(arr));

        //count even or odd
        int count_even=0;
        int count_odd=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("Even numbers in the array:"+count_even);
        System.out.println("Odd numbers in the array:"+count_odd);

        int SecondLargest=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                SecondLargest=max;
                max=arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i]!=max)
            {
                SecondLargest=arr[i];
            }
        }
        System.out.println("Second largest Elemnt of the array:"+SecondLargest);

        //serch an element in the array
        System.out.println("Enter the element to be searched:");
        int search=sc.nextInt();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element found at index:"+i);
                break;
            }
        }

        //Merge 2 array
        System.out.println("Enter the size of the second array:");
        int size2=sc.nextInt();
        System.out.println("Enter the elements of the second array:");
        int[] arr2=new int[size2];

        int merged[]=new int[arr.length+arr2.length];

        for(int i=0; i<arr.length; i++)
        {
            merged[i]=arr[i];
        }
        for(int i=0; i<arr2.length; i++)
        {
            merged[arr.length+i]=arr2[i];
        }
        System.out.println("Merged array:"+Arrays.toString(merged));



    }
}
