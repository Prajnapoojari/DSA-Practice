import java.util.ArrayList;

public class MissingAndRepeatingInAnArray {
    public static void main(String[] args) {
        int arr[]={1,3,3};
        int temp[]=new int[arr.length];
        ArrayList<Integer> result =new ArrayList<>();
        for( int i=0; i<arr.length; i++)
        {
            if(temp[arr[i]-1]!=0)
            {
                result.add(arr[i]);
            }
            temp[arr[i]-1]=arr[i];
        }
        for(int i=0; i<temp.length; i++)
        {
            if(temp[i]==0)
            {
                result.add(i+1);
            }
        }
        System.out.println(result);

    }

}
