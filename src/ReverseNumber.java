import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        // Logic-1 using algorithum
        /* while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        } */

        //Logic-2 using StringBuffer class
//        StringBuffer sb=new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        StringBuffer sb=new StringBuffer();
//        sb.append(num);
//        sb.reverse();

        // using StringBulider
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        sbl.reverse();
        System.out.println("the reverse number for the given input is: "+ sbl);
    }
}
