import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRangesOfNumbers {
    public static void main(String[] args) {
        int arr[]={14, 15, 20, 30, 31, 45};
        List<List<Integer>> globalList= new ArrayList<>();
            int lower = 10, upper = 50;
            int i = lower;
            int j = 0;
            while(j< arr.length)
            {
                if(i!=arr[j])
                {
                    globalList.add(Arrays.asList(i, arr[j]-1));
                    i=arr[j]+1;
                    j++;
                }
                else {
                    i++;
                    j++;
                }

            }
            if(i!=upper+1)
            {
                globalList.add(Arrays.asList(i, upper));
                i++;

            }
            System.out.println(globalList);

        }
    }
