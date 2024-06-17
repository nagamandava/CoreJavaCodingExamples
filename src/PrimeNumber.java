import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();  // Close the scanner to avoid resource leaks

        int count = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("given number is prime");
            } else {
                System.out.println("not a prime number");
            }
        } else {
            System.out.println("not a prime number");
        }
    }
}
