 

import java.io.*;
public class file2 {
    public static void main(String[]args){
           try{
            File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//test_file.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line; 
            int charcount=0,words=0,sentences=0,whitespace=0;
            while((line= bufferedReader.readLine())!= null ){
                //  sentences++;
                 words++;
                 for(int i = 0;i<line.length();i++){
                    if(line.charAt(i)==' '){
                        words++;
                        whitespace++;
                        charcount++;
                    }
                    else if(line.charAt(i)=='.'){
                        sentences++;
                    }
                    else{
                        charcount++;
                    }
                 }
            }
            System.out.println("Total number of words: "+words);
            System.out.println("Total number of characters: "+charcount);
            System.out.println("Total number of sentences: "+sentences);
            System.out.println("Total number of whitespace: "+ whitespace);
             
            }
           catch(IOException a){
            System.out.println("There's an error fetching your file");
           }
           finally{
            System.out.println("Execution has come to an end");
           }
        
    }
}
