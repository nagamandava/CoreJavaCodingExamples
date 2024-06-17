import java.util.Arrays;
import java.util.Collections;

public class SortUsingBultInMethods {

    public static void main(String[] args) {
        int[] arr = {10, 60, 20, 40, 30, 80, 100};
        System.out.println("before sorting the array: " + Arrays.toString(arr));
        Arrays.parallelSort(arr);
        // Arrays.sort(arr);
        System.out.println("After sorting the array: " + Arrays.toString(arr));

        //to sort descending order
        Integer a[] = {10, 60, 20, 40, 30, 80, 100};
        System.out.println("before sorting the array: " + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After sorting the array: " + Arrays.toString(a));

    }
}
