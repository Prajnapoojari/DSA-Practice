import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    // ✅ Method defined outside main
    static ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(arr.length == 0) {
            return list;
        }

        int lastElement = arr[0];
        list.add(lastElement);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != lastElement) {
                list.add(arr[i]);
                lastElement = arr[i];
            }
        }

        return list;
    }

    // ✅ main method
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3};

        ArrayList<Integer> result = removeDuplicates(arr);

        System.out.println(result);
    }
}