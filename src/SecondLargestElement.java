// without sorting
//public class SecondLargestElement {
//    public static void main(String[] args) {
//        int[] array={22,10,2,77,78,63};
//        if(array.length<2) {
//            System.out.println("array have at least 2 elemnt");
//        }
//        int max=array[0];
//        int secondMax=Integer.MAX_VALUE;
//        for(int i=0; i< array.length; i++)
//        {
//            if(array[i]>max)
//            {
//                secondMax=max;
//                max=array[i];
//            }
//            else if (array[i] > secondMax && array[i] != max)
//            {
//                secondMax=array[i];
//            }
//        }
//        System.out.println("The second largest element is: " + secondMax);
//    }
//}

import java.sql.Array;
import java.util.Arrays;

// with sorting
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 48, 76, 96, 47, 58, 63};
        Arrays.sort(arr);
        System.out.println("The second largest element is: " + arr[arr.length - 2]);
    }
}


