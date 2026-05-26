public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int arr[]={12,345,2,66,78654};
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int num=arr[i];
            int digits=0;
            while(num>0)
            {
                num=num/10;
                digits++;
            }
            if(digits%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
