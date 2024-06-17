public class RemovingWhiteSpacesInString {
    public static void main(String[] args) {
        String s="NAGA   IS VERY            GOOD HUMAN     BEING";
        System.out.println("after removing the white spaces in string: " + s);
        String string = s.replaceAll("\\s", "");
        System.out.println("after removing the white spaces in string: " + string);
    }
}
