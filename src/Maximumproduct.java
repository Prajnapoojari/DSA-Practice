public class Maximumproduct {
    public static void main(String[] args) {
        int arr[]={0,2,1,1,1,1,0,0,0};
        int max=1;
        int i=0;
        while(i<arr.length-1)
        {
            int x=i, y=i+1;
            while(y<arr.length && arr[x]==arr[y])
            {
                y++;
            }
            max=Math.max(max, y-x);
            i=y;
        }
        System.out.println(max);
    }
}
