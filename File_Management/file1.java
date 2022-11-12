package File_Management;

import java.io.*;

public class file1 { 
    public static void main(String[]args){
           try{
            File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//test_file.txt");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//test_file1.txt");
            int upperChar;
            int ch;
            while((ch=fr.read()) !=-1){
                upperChar = Character.toUpperCase(ch);
                fw.write(upperChar);
            }
            fr.close();
            fw.close();
           }
           catch(IOException a){
            System.out.println("There's an error fetching your file");
           }
           finally{
            System.out.println("Execution has come to an end");
           }
        
    }
}
