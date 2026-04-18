import java.util.Optional;

public class SumOfAllSubarrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int result=0;
        for( int i=0; i< arr.length; i++)
        {
            result+=arr[i]*(i+1)*(arr.length-i);
        }
        System.out.println(result);
    }
}
