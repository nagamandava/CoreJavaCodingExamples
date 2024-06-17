import java.util.Scanner;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("given number is even number");
        }else {
            System.out.println("given number is odd number");
        }*/
        int[] a = {2, 3, 4, 5, 6,88,99,765};
        for (int number : a) {
            if (number % 2 == 0) {
                System.out.println("given number is even number: " + number);
            } else System.out.println("given number is odd number: " + number);
        }
    }
}
