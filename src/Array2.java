public class Array2 {
    public static void main(String[] args) {
        int arr[]= {5, 3, 9, 1, 7};
        int sum=0;
        int even=0;
        int odd=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];

            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }

        }
        int average=sum/arr.length;
        System.out.println("Average of the array elements: " + average);
        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);

        for(int x=0, j=arr.length-1; x<j; x++,j--){
            int temp=arr[x];
            arr[x]=arr[j];
            arr[j]=temp;

        }
        System.out.println("Reversed array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
