public class ReverseWordsInaString {
    public static void main(String[] args) {
        String str = "Today onwords keep calm to keep the relationship strong";
        String[] words = str.split("\\s");
        String reverseword = "";

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword = reverseword + sb.toString() + " ";
        }
        System.out.println(reverseword);

    }
}
