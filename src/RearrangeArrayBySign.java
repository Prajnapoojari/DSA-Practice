import java.util.*;

public class RearrangeArrayBySign {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-1, 2, -3, 4, -5, 6, 4, 5));

        ArrayList<Integer> temp = new ArrayList<>();

        int positiveIndex = get(0, true, arr);
        int negativeIndex = get(0, false, arr);

        // alternate positive and negative
        while (positiveIndex < arr.size() && negativeIndex < arr.size()) {

            temp.add(arr.get(positiveIndex));
            positiveIndex = get(positiveIndex + 1, true, arr);

            temp.add(arr.get(negativeIndex));
            negativeIndex = get(negativeIndex + 1, false, arr);
        }

        // remaining positives
        while (positiveIndex < arr.size()) {
            temp.add(arr.get(positiveIndex));
            positiveIndex = get(positiveIndex + 1, true, arr);
        }

        // remaining negatives
        while (negativeIndex < arr.size()) {
            temp.add(arr.get(negativeIndex));
            negativeIndex = get(negativeIndex + 1, false, arr);
        }

        System.out.println(temp);
    }

    // helper method
    static int get(int x, boolean positive, ArrayList<Integer> arr) {
        while (x < arr.size()) {

            if (positive && arr.get(x) >= 0)
                return x;

            if (!positive && arr.get(x) < 0)
                return x;

            x++;
        }
        return arr.size();
    }
}