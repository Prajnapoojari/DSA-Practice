import java.util.Arrays;
public class Rotate
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        for (int x = 0, y = arr.length - 1; y > x; x++, y--) {
            swap(arr, x, y);
        }
        for (int x = arr.length - d, y = arr.length - 1; y > x; x++, y--)
        {
            swap(arr, x, y);
        }
        for(int x=0, y=arr.length-d-1; y>x; x++, y--)
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