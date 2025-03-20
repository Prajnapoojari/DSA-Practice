public class CountEvenOdd {
    public static void main(String[] args) {
        int[] array={10, 15, 20, 25, 30};
        int EvenCount=0, OddCount=0;
        for(int i=0; i<array.length; i++)
        {
            if(i%2==0)
            {
                EvenCount++;
            }
            else
            {
                OddCount++;
            }
        }
        System.out.println("total Even Count is:"+EvenCount);
        System.out.println("total Odd Count is:"+OddCount);

    }
}
