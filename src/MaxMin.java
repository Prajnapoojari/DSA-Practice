public class MaxMin {
    public static void main(String[] args) {
        int[] array={10, 20, 5, 8, 30};
        int Max=array[0];
        int Min=array[0];
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>Max)
            {
                Max=array[i];
            }
            if(array[i]<Min)
            {
                Min=array[i];
            }
        }
        System.out.println("Maximum number is:"+Max);
        System.out.println("Minimum number is:"+Min);
    }
}
