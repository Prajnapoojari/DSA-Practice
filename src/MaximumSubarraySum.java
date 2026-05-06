public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=arr[0], sum=arr[0];
        for(int i=1; i< arr.length; i++)
        {
            max=Math.max(max+arr[i], arr[i]);
            sum=Math.max(sum, max);

        }
        System.out.println(sum);
    }
}
