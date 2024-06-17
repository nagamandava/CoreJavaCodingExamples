import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {

        int[] arr = {6, 2, 1, 0, 9, 8, 7,};
        System.out.println("array before sorting: " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
