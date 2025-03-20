import javax.lang.model.element.Element;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n= sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the numbers");
        for(int i=0; i<n; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the Search elemnet");
        int SearchKey= sc.nextInt();

        boolean found=false;
        for(int i=0; i<n; i++)
        {
            if(array[i]==SearchKey)
            {
                System.out.println("Element Found in index of"+ i);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Element Not found");
        }

sc.close();

    }
}
