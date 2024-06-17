public class PalindromeString {
    public static void main(String[] args) {
        /*
        A palindrome is a word, phrase, number, or other sequence of characters
        that reads the same forward and backward
        (ignoring spaces, punctuation, and capitalization). For example,
         the word "MADAM" is a palindrome because it reads the same forwards and backwards.
         */
        String str="MADAM";
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        StringBuffer reverse = sb.reverse();
        String orginalString=str;
        if (reverse.toString().equals(orginalString)){
            System.out.println("given string is palindrome");
        }else System.out.println("given String is not plaindrome string");

    }
}
