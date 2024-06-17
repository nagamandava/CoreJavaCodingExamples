import java.util.Arrays;

public class EqalityOfArrays {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};
        boolean result = Arrays.equals(a1, a2);
        if (result==true){
            System.out.println("given two arrays are equal");
        }else {
            System.out.println("given two arrays are not equal");
        }

    }
}
