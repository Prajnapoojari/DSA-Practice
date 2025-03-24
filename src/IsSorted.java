public class IsSorted {
    public static boolean isSorted(int[] arr)
    {
        for(int i=0; i< arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
                return true;
            }


    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,1,8,6,4};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));

    }
}
