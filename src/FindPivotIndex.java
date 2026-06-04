public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int sum=0; int leftsum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            if(leftsum==sum-arr[i]-leftsum)
            {
                System.out.println(i);
                return;
            }
            leftsum+=arr[i];
        }
         System.out.println("-1");
    }
}
