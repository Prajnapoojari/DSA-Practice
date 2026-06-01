public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int arr[]={3, 6, 7,2};
        int max=arr[0];
        int index=0;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(i!=index)
            {
                if(max<2*arr[i])
                {
                    System.out.println("-1");
                    return;
                }
            }

        }
        System.out.println(index);
    }
}

