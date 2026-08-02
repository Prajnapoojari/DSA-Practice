public class Array1 {
    public static void  main(String args[]){
        int arr[]={4, 8, 2, 8, 5, 8, 1};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        int targert=8;
        int count=0;
        int newArr[]=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            } if (arr[i]<min) {
                min=arr[i];

            }
            sum=sum+arr[i];
            if(arr[i]==targert) {
                count++;
            }
            newArr[i]=arr[i]+2;
        }
        for (int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sum: "+sum);
        System.out.println("Count of "+targert+" is: "+count);

    }
}
