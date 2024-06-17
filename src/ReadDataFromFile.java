import java.io.*;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("C:\\Users\\manda\\OneDrive\\Documents\\Naga Resume-USA\\job-credentials.txt");
//        BufferedReader br=new BufferedReader(fr);
//        String str;
//        while((str=br.readLine())!=null){
//            System.out.println(str);
//        }

        //approach 2
        File file = new File("C:\\\\Users\\\\manda\\\\OneDrive\\\\Documents\\\\Naga Resume-USA\\\\job-credentials.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
