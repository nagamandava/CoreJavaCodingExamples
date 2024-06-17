import java.util.Scanner;

public class CountOfDigitsInANumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        while (num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println("sum of digits is: " + sum);
    }
}
