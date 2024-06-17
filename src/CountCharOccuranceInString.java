public class CountCharOccuranceInString {
    public static void main(String[] args) {
        String str = "I Am Nagalakshmi Java dveloper";
        int totalLength = str.length();
        int totallengthAfterRemovinga = str.replace("a", "").length();
        int count = totalLength - totallengthAfterRemovinga;
        System.out.println("number of ocuurances of a is: " + count);

    }
}
