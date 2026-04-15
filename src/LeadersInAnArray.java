import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int arr[]={16, 17, 4, 3, 5, 2};
        int leader=arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--)
        {
            if(leader<=arr[i])
            {
                list.add(arr[i]);
                leader=Math.max(leader, arr[i]);

            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
