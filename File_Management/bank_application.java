import java.util.*;
import java.io.*;

public class bank_application {
    static Scanner sc = new Scanner(System.in);
    String name,acc_num;
    static int bal;
    bank_application(){
        name = "Rakesh";
        acc_num="21344NBC2";
        bal = 1000;
    }
    public static void main(String [] args) throws bank_application.nosufficientfund{
         bank_application b1 = new bank_application();
         System.out.println("1)Check Balance          3)Withdraw Money\n2)Deposit Money          4)Exit");
         int choice=0;
         while(choice!=4){
            System.out.print("Enter a choice: ");
         choice = sc.nextInt();
         switch(choice){
            case 1:
              System.out.println("Current Balance is: "+bal);
              break;
            case 2:
               System.out.print("Enter the amount you want to add: ");
               int amt = sc.nextInt();
               addmoney(amt);
               break;
            case 3:
             System.out.print("Enter the amount you want to withdraw: ");
             int cred = sc.nextInt();
             takemoney(cred);
             break;
            case 4:
             System.out.println("Thank you for choosing us!!");
             break;
         }
        }
        
         
    }
    public static void addmoney(int amt){
        bal +=amt;
        System.out.println("Successfully deposited: "+amt+"\nCurrent Balance is: "+bal);
    }
    public static void takemoney(int amt) throws nosufficientfund{
      if(amt>bal){
        throw new nosufficientfund(amt);
      }
      else{
        bal-=amt;
        System.out.println("Successfullt withdrawed: "+amt+"\nCurrent Balance is: "+(bal));

      }
    }
    public static class nosufficientfund extends Exception{
        private int n;
        nosufficientfund(int a){
            n = bal;
        }
        public String toString(){
            return ("Not Sufficient Fund\nCurrent Balance- "+n);
        }
    }
}

