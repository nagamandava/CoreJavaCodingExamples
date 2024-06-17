public class ReverseString {
    public static void main(String[] args) {
        String str = "Nagalakshmi";
        String rev = "";
        //using String (Concatanation) operator
//        int length = str.length();
//        for (int i=length-1;i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
        //Using StringBuffer Class
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        StringBuffer reverse = sb.reverse();
        System.out.println("reverse a string is: " + reverse);
    }
}
