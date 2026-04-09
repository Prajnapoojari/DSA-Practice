public class WaveArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0; i<arr.length-1; i=i+2)
        {
            swap(arr,i,i+1);
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
