public class CountTheWordsInString {
    public static void main(String[] args) {
        String s="Naga Is becoming a Javadeveloper at JPMC soon";
        System.out.println("given string is: " + s);

        int count=1;
        for(int i =0;i<s.length()-1;i++){
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("number of words given in as tring is :" + count);
    }
}
