public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        /** // Brute Force Approach
        int[] result= new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            int product=1;
            for(int j=0; j<arr.length; j++)
            {
                if(i!=j)
                {
                    product=product*arr[j];
                }
            }
            result[i]=product;
        }
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }


        // Division Approach
        int TotalProduct=1;
         for(int i=0; i<arr.length; i++)
         {
             TotalProduct=TotalProduct*arr[i];
         }

         int[] result= new int[arr.length];
         for(int i=0; i<arr.length; i++)
         {
             result[i]=TotalProduct/arr[i];
         }
            for(int i=0; i<result.length; i++)
            {
                System.out.print(result[i]+" ");
            }
         */

        //O(n) Approach without using division
        int[] result= new int[arr.length];
        int LeftProduct=1;
        for(int i=0; i<arr.length; i++)
        {
            result[i]=LeftProduct;
            LeftProduct=LeftProduct*arr[i];
        }
        int RightProduct=1;
        for(int i=arr.length-1; i>=0; i--)
        {
            result[i]=result[i]*RightProduct;
            RightProduct=RightProduct*arr[i];
        }
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
