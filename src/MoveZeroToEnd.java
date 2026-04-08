public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4};
        int k=1;
        for(int i=0; i<arr.length && k<arr.length; i++)
        {
            if(arr[i]==0)
            {
                if(i>=k)
                {
                    k=i+1;
                }
                while(k<arr.length)
                {
                    if(arr[k]!=0)
                    {
                        swap(arr,i,k);
                        k++;
                        break;
                    }
                    k++;
                }

            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int i, int k)
    {
        int temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }
}
