import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {

        int arr[]={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list= new ArrayList<>();
        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=Math.max(arr[i], max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}

