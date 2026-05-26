public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=8;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=target)
            {
                System.out.println(i);
            }
        }
            System.out.println(arr.length);
    }
}
