import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr []={4,6,7,8,9};
        for(int x=0,y=arr.length-1; y>x; x++,y--)
        {
           swap(arr,x,y);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int x, int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
