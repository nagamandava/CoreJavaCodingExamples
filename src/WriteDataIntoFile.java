import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fr=new FileWriter("C:\\Users\\manda\\OneDrive\\Documents\\Naga Resume-USA\\corejava.txt");
        BufferedWriter br=new BufferedWriter(fr);
        br.write("hello this is my java example");
        br.write("Today i have practiced and  completed 30 programmes");
        br.write("all these will upload into git");
        br.write("thank you all for your sopport");
        System.out.println("wrtiting file is completed");

        br.close();
    }
}
