 
import java.io.*;
import java.util.*;

public class duplicate{
    public static void main(String[]args) throws IOException {
       
        File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//File_Management//test.txt");
        //buffered reader i dont know much i just use
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        //declaration of the hashset we will use for our lines
        HashSet<String> hs = new HashSet<String>(100);
        String line;
        while((line=br.readLine())!=null){
            hs.add(line);
            // System.out.println("File editing done!!");
        }
        br.close();
        FileWriter fw =new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String finalline:hs){
            bw.write(finalline);
            bw.newLine();
        }
        bw.close();
        
        // System.out.println("File editing done!!");
    }
}
 