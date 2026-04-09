/* public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};
        int x=0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                x=Math.max(x, arr[j]-arr[i]);
            }
        }
        System.out.println(x);
    }
} */
public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[]={7, 10, 1, 3, 6, 9, 2};
        int x=0;
        int max=1;
        for(int i=arr.length-1; i>=0; i--)
        {
            x=Math.max(x,arr[i]);
            max=Math.max(max, x-arr[i]);
        }
        System.out.println(max);

    }
}
