import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int n= array.length;
        int[] reversedArray=new int[n];
        for(int i=0; i<n; i++)
        {
            reversedArray[i]=array[n-i-1];
        }
        System.out.println("Reversed List Of Array :" + Arrays.toString(reversedArray));

    }
}
