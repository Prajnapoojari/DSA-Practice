public class AddingArrayOfDigits {
    public static void main(String[] args) {
        int arr[]={1,2,4};
        int x=0;
        for(int i=0; i< arr.length; i++)
        {
            x=(x*10)+arr[i];
        }
        System.out.println(x+1);
    }
}
