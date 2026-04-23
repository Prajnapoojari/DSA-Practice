import static java.util.Collections.reverse;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 7, 5, 0};
        for(int i=arr.length-2; i>=0; i--)
        {
            if(arr[i]<arr[i+1])
            {
                for(int j=arr.length-1; j>i; j--)
                {
                    if(arr[i]<arr[j])
                    {
                        swap(arr,i,j);
                        break;
                    }
                }
                reverse(arr, i+1, arr.length-1);
                break;
            }
            if(i==0)
            {
                reverse(arr, 0, arr.length-1);
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int[] arr, int x, int y)
    {
        while(x<y)
        {
            swap(arr,x,y);
            x++;
            y--;
        }
    }
}
