import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementII {
    public static void main(String[] args) {
        int arr[]={2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> list=new ArrayList<>();
        int x=0, y=0, countx=0, county=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == x) {
                countx++;
            } else if (arr[i] == y) {
                county++;
            } else if (countx == 0) {
                x = arr[i];
                countx = 1;
            } else if (county == 0) {
                y = arr[i];
                county = 1;
            } else {
                countx--;
                county--;
            }
        }
        countx=0;
        county=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
                countx++;
            }
            else if (arr[i]==y)
            {
                county++;
            }
        }
        if(countx> arr.length/3 && county>arr.length/3)
        {
            if(x>y)
            {
                System.out.println(new ArrayList<Integer>(Arrays.asList(y,x)));
            }
            else
            {
                System.out.println(new ArrayList<Integer>(Arrays.asList(x,y)));
            }
        }
        else
        {
            if(countx> arr.length/3)
            {
                list.add(x);
                System.out.println(list);
            } else if (county>arr.length/3) {
                list.add(y);
                System.out.println(list);
            }
            System.out.println(list);
        }

    }
}
