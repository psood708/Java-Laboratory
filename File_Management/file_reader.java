import java.io.*;
import java.util.*;
public class file_reader  {
    static File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//File_Management//student_data.txt");
   public static void main(String[]args)throws IOException{
     try{
        FileReader fr = new FileReader(file);
        int itr;
         while((itr=fr.read())!=-1){
            System.out.print((char)itr);
         }
        fr.close();   
     }
     finally{
        System.out.println("\nFIle Writing done!!");
     }
   }   
}