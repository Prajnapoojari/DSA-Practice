import java.util.ArrayList;

public class AlternatesArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        ArrayList<Integer> list=new ArrayList<>();



        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                list.add(arr[i]);
            }
        }

        System.out.println(list);


    }
}
