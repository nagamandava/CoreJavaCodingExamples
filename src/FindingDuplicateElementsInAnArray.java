import java.util.HashSet;

public class FindingDuplicateElementsInAnArray {
    public static void main(String[] args) {
        String arr[]={"naga","ram","Kittu","bindhu","bindhu"};
        boolean flag=false;
       // for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if (arr[i]==arr[j]){
//                    System.out.println("found duplicate element: "+ arr[i]);
//                    flag=true;
//                }
//
//            }
//
//        }
//        if (flag==false){
//            System.out.println("couldnt find any duplicate number");
//        }
        HashSet<String> dupli=new HashSet<>();
        for(String element:arr){
            if(dupli.add(element)==false){
                System.out.println("found duplicate elemnt: "+ element);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("duplicate elemnt not found");
        }
    }
}
