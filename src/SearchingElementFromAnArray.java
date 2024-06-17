import java.util.Arrays;

public class SearchingElementFromAnArray {
    public static void main(String[] args) {
        // This is using Liner Search Algorithum
       /* int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchElemt = 8;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (searchElemt == arr[i]) {
                System.out.println("Element found at: " + arr[i]);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }*/
        //using Binarysearch Algorithum
        int a[]={1,2,3,4,5,6};
        System.out.println("element fount at: " + Arrays.binarySearch(a,5));//giving output at the index level
    }
}
