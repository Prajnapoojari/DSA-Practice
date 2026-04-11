public class StockBuyAndSell_MultipleTransaction {
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        boolean buy=false;
        int buyValue=0;
        int profit=0;

        for(int i=0; i<arr.length-1; i++)
        {
            if(!buy)
            {
                if(arr[i]<arr[i+1])
                {
                    buy=true;
                    buyValue=arr[i];
                }
            }
            else {
                if(arr[i]>arr[i+1])
                {
                    buy=false;
                    profit=profit+(arr[i]-buyValue);
                }
            }
        }
        if(buy)
        {
            profit=profit+(arr[arr.length-1]-buyValue);
        }
        System.out.println(profit);
    }
}
