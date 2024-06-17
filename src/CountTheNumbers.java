import java.util.Scanner;

public class CountTheNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=sc.nextInt();
        int count=0;
        while (number!=0){
            number=number/10;
            count++;
        }
        System.out.println("the total count of tdidgits in a given number is: " + count);


    }
}
