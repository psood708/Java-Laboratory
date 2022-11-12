import java.util.*;
import java.io.*;

public class file3 {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        HashSet<String> set = new HashSet<>();
        // set.add("I am a good boy");
        // set.add("This is cool weather");
        // set.add("Woww this is fun");
        // set.add("I am a good boy");
        System.out.println(set);
        // System.out.println(set);
        FileInputStream fis = new FileInputStream(file);
        FileWriter fw = new FileWriter("test3.txt");
        InputStreamReader ir = new InputStreamReader(fis);
        // FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(ir);
        FileReader fr = new FileReader(file);
        // 
        if(br.readLine()!=null){
            // System.out.println("i");
            String sp = br.readLine();
            System.out.println(br.readLine());
            set.add(sp);
        }
        else{
            // System.out.println(1);
        }
             Iterator<String> itr = set.iterator();
       while(itr.hasNext()){
        String[] filecp = set.toArray(new String[set.size()]);
         int num = set.size();
         for(int i = num-1;i>=0;i--){
            fw.write(filecp[i]);
         }
       }
        

    }
}