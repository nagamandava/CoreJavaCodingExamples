import java.util.Scanner;

public class countOddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (number != 0) {
            int rem = number % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number = number / 10;

        }
        System.out.println("even number count is: " + evenCount);
        System.out.println("even number count is: " + oddCount);
    }
}
