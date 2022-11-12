// package Lab_9;
import java.util.Scanner; 

// import javax.xml.transform.SourceLocator;
public class tenth{ 
    public static void main(String[]args){
     HDFC acc_1 = new HDFC();
     System.out.println("IFSC code of A branch of HDFC bank is: "+acc_1.getIFSC("HDFC"));
     ICICI acc_2 = new ICICI();
     System.out.println("IFSC code of B branch of ICICI bank is: "+acc_2.getIFSC("ICICI"));
     SBI acc_3 = new SBI();
     System.out.println("IFSC code of C branch of SBI bank is: "+acc_3.getIFSC("SBI"));
    }   
    public static class HDFC{
        String getIFSC(String bnk){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numeric part of the IFSC code: ");
            int ifs = sc.nextInt();
            return  bnk+ifs;
        }
    }
    public static class ICICI extends HDFC{};
    public static class SBI extends HDFC{};
    } 

