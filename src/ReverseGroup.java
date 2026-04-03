import java.util.Arrays;


public class ReverseGroup {
    public static void main(String[] args)
    {
        int arr []={1,2,3,4,5,6,7,8};
        int k=3;
        for(int i=0; i<arr.length; i=i+k)
        {
            for(int x=i, y=i+k-1 > arr.length-1 ? arr.length-1 : i+k-1 ; y>x; x++,y--)
            {
                swap(arr,x,y);
            }
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
