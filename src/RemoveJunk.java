public class RemoveJunk {
    public static void main(String[] args) {
        String s="!@#$fghjk#$%^&8dfghDFGHJ$%^&8RFGHertyu$%^&*";
        String s1 = s.replaceAll("[^A-Za_z0-9]", "");
        System.out.println(s1);

    }
}
