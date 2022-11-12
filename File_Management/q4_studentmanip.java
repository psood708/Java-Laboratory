import java.io.*;
import java.util.*;

public class q4_studentmanip {
    static File file = new File("C://Users//parth//OneDrive//Desktop//DESKTOP//CODING//JavaScript//Java_lab//File_Management//student_data.txt");
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) throws IOException{
            
           //we need to give 3 options so we do 1->Read info 2->Input info 3-> Exit
           System.out.println("Choose one option: \n 1)Read Info      2)Input Info    3)Exit");
           int i = sc.nextInt();
           switch(i){
            case 1:
              read_info();
              break;
            case 2:
               input_info();
               break;
            case 3:
              System.out.println("Thank you for using our manager!!!");
              break;
            default:
              System.out.println("Check your input!!");
           }
        
    }
    public static void read_info() throws IOException{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
    public static void input_info() throws IOException{
       System.out.println("Welcome to out manager!!\nYou are here to input Data!!\n");
       String cname,fname,bname;
       int roll,batch;
       FileWriter fw = new FileWriter(file);
       BufferedWriter bw = new BufferedWriter(fw);
       System.out.print("Enter College name: ");
       cname = sc.next();
       System.out.print("Enter your branch name: ");
       bname = sc.next();
       System.out.print("Enter your roll number: ");
       roll = sc.nextInt();
       System.out.print("Enter your batch year: ");
       batch = sc.nextInt();
       System.out.print("Enter Full name: ");
       fname = sc.next();
       
       String info = "\nName: "+fname+" Roll NO: "+roll+" Branch: "+bname+" Batch: "+batch+" College "+cname;
       bw.write(info);
       bw.close();
    }
}
