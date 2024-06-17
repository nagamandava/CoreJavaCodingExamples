public class MinAndMaxNumberFromArray {
    public static void main(String[] args) {

        int[] array = {23, 45, 60, 90, 77, 88, 2346, 86, 45};
//        int max=array[0];
//        for (int i=1;i<array.length;i++){
//
//           if (array[i]>max){
//               max=array[i];
//           }
//        }
//        System.out.println("maxium element in the given array is: " +max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum element in the given array is: " + min);
    }
}
