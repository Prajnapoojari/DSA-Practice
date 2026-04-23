public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,1,2};
        int x=0; int count=1;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]==x) {
                count++;
            }
            else
            {
                count--;
                if(count<=0)
                {
                    x=arr[i];
                    count++;
                }
            }
        }
        count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
                count++;

        }
        if(count>arr.length/2)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
