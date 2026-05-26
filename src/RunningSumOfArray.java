public class RunningSumOfArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        // Calculate running sum
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        // Print array elements
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
