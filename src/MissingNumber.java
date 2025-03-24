public class MissingNumber {
    public static int missingnumber(int[] arr, int n)
    {
        for(int i=0; i< arr.length-1; i++)
        {
            if(arr[i+1]-arr[i]>1)
            {
                return arr[i]+1;

            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int n=6;
        int missingNo=missingnumber(arr,n);
        System.out.println(missingNo);

    }
}
