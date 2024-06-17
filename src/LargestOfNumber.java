import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a: ");
        a = sc.nextInt();
        System.out.println("enter number b: ");
        b = sc.nextInt();
        System.out.println("enter number c: ");
        c = sc.nextInt();
//        if (a > b && a > c) {
//            System.out.println("the largest number is a: " + a);
//        } else if (b > a && b > c) {
//            System.out.println("the largest number is b: " + b);
//        } else System.out.println("the largest number is c: " + c);

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);

    }
}
