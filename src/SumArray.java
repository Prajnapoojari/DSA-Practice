
public class SumArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int sum=0;
        for(int i=0; i<array.length; i++)
        {
            sum=sum+array[i];
        }
        System.out.println("Total Sum of array is:"+ sum);
    }
}
