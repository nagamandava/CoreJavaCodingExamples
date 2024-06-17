import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        int originalNumber=number;
        int reverseNumber=0;
        while (number!=0){
            reverseNumber=reverseNumber*10+number%10;
            number=number/10;
        }
//        System.out.println(reverseNumber);
        if (reverseNumber==originalNumber){
            System.out.println("given number is equal to original number");
        }else System.out.println("revereseNumber is not equal to originalNumber");

    }
}
