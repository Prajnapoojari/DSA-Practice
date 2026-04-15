import java.util.*;

public class RearrangeArrayBySign {

    void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> temp = new ArrayList<>();

        int positiveIndex = getIndex(0, true, arr);
        int negativeIndex = getIndex(0, false, arr);

        // alternate elements
        while (positiveIndex < arr.size() && negativeIndex < arr.size()) {

            temp.add(arr.get(positiveIndex));
            positiveIndex = getIndex(positiveIndex + 1, true, arr);

            temp.add(arr.get(negativeIndex));
            negativeIndex = getIndex(negativeIndex + 1, false, arr);
        }

        // add remaining positives
        while (positiveIndex < arr.size()) {
            temp.add(arr.get(positiveIndex));
            positiveIndex = getIndex(positiveIndex + 1, true, arr);
        }

        // add remaining negatives
        while (negativeIndex < arr.size()) {
            temp.add(arr.get(negativeIndex));
            negativeIndex = getIndex(negativeIndex + 1, false, arr);
        }

        arr.clear();
        arr.addAll(temp);
    }

    int getIndex(int x, boolean positive, ArrayList<Integer> arr) {

        if (positive) {
            while (x < arr.size() && arr.get(x) < 0) {
                x++;
            }
        } else {
            while (x < arr.size() && arr.get(x) >= 0) {
                x++;
            }
        }

        return x;
    }
}