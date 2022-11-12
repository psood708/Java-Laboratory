import java.io.*;
import java.util.*;
public class file_writer  {
    static File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//File_Management//student_data.txt");
   public static void main(String[]args)throws IOException{
     try{
        FileWriter fw = new FileWriter(file);
        fw.write("\nHellow I am doing File Write");
        fw.close();
     }
     finally{
        System.out.println("FIle Writing done!!");
     }
   }   
}
