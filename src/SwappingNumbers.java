import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a, b, t = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a: ");
        a = sc.nextInt();

        System.out.println("enter number b: ");
        b = sc.nextInt();
        System.out.println("before swapping two numbers: " + a + " " + b);
        //logic 1 using the third variable
//        t = a;
//        a = b;
//        b = t;
// logic 2 using the + and - sysmbols
//        a=a+b;
//        b=a-b;
//        a=a-b;
//logic3 using * and / operator
//        a=a*b;
//        b=a/b;
//        a=a/b;
//logic4 using bitwise XOR(^) operator
//        a=a^b;
//        b=a^b;
//        a=a^b;
// logic 5 using single statement
        b = a + b - (a = b);

        System.out.println("After swapping two numbers: " + a + " " + b);
    }
}
