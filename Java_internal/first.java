import java.util.*;
public class first {
    public static void main(String[]args){
        customer b1 = new customer();
        customer b2 = new customer();
        b1.newAcc();
        b1.loanTake();
        b1.repay();
        b1.checkStat();
        b1.loanTake();
       
        b1.repay();
        b1.checkStat();
        b1.checkStat();
        b1.checkBank();
    }
    public static class bank {
        int Networth = 50000;
        int Num_acc = 0;
        int loan_sanctioned = 0;
        void checkBank() {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("**********Welcome Bank Admin**********");
            System.out.println("Press 1 to check the Networth");
            System.out.println("Press 2 to check the Number of Accounts");
            System.out.println("Press 3 to check the Total Loan Amount Sanctioned");
            System.out.println("Press 4 to check all things");
            System.out.println();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The networth of the bank is: " + Networth);
                    break;
                case 2:
                    System.out.println("The number of accounts are: " + Num_acc);
                    break;
                case 3:
                    System.out.println("Total amount sanctioned: " + loan_sanctioned);
                    break;
                case 4:
                    System.out.println("The networth of the bank is: " + Networth);
                    System.out.println("The number of accounts are: " + Num_acc);
                    System.out.println("Total amount sanctioned: " + loan_sanctioned);
                    break;
            }
            System.out.println("");
        }
    }
    public static class customer extends bank {
        Scanner sc = new Scanner(System.in);
        int Customer_num;
        int loan =0;
        String Customer_name;
        int acc_balance;
        String [] transactions = new String[100];
        int transac = 0 ;
        void newAcc() {
            System.out.println("Hello welcome to new Bank!!");
            System.out.print("Enter your name: ");
            String s =sc.nextLine();
            System.out.print("Enter your account number: ");
            int num = sc.nextInt();
            int loan = 0;
            System.out.print("Enter your balance: ");
            int bal = sc.nextInt(); 
            this.Customer_name = s;
            this.Customer_num = num;
            this.acc_balance = bal;
            super.Num_acc++;
            super.Networth += this.acc_balance;
        }
         void repay(){
            if(loan>0){
                System.out.println("Do you want to repay? ");
                System.out.print("Press 1 for yes , press 2 for no: ");
                int choi = sc.nextInt();
                switch(choi){
                 case 1:
                   System.out.println("How much do you want to repay: ");
                   int rep = sc.nextInt();
                   if(rep<= this.acc_balance){
                     this.repayLoan(rep);
                   }
                   else{
                     System.out.println("Insufficient Balance");
                   }
                   break;
                 case 2:
                  break;
                 default:
                   System.out.println("Check the key you entered");  
                }
             }
        }
        void loanTake(){
            
            System.out.println("Do you want a loan? ");
            System.out.println("Press 1 for yes , Press 2 for no");
            int n = sc.nextInt();
            switch(n){
                case 1:
                  System.out.print("How much do you want to take as a loan: ");
                  loan = sc.nextInt();
                  this.loanSanction(loan);
                  break;
                case 2:
                  break;
                default:
                 System.out.println("Please enter the correct value");
            }
        }
        void loanSanction(int loan) {
            if ((loan < 2 * acc_balance) && (loan < Networth)) {
                loan_sanctioned = loan;
                acc_balance+=loan;
                Networth -= loan;
                String s = ("Loan: "+loan_sanctioned);
                transactions[transac] = s;
                transac++;
            } else {
                System.out.println("You can't take this loan limit exceeded");
            }
        }
        void repayLoan(int rep) {
            if (rep > loan_sanctioned) {
                acc_balance -= loan_sanctioned;
                Networth += loan_sanctioned;
                loan_sanctioned = 0;
                String s = ("Repayment: "+ (rep - loan_sanctioned));
                transactions[transac] = s;
                transac++;
            } else {
                Networth += rep;
                acc_balance -=rep;
                loan_sanctioned = loan_sanctioned - rep;
                String s = ("Repayment: "+ (rep));
                transactions[transac] = s;
                transac++;
            }
        }
        void checkStat(){
            System.out.println();
            System.out.println("<-------Welcome to bank Portal------->");
            System.out.println("Hello "+Customer_name+" !!");
            System.out.println("Account number: "+Customer_num);
            System.out.println("Press 1 for Balance Enquiry");
            System.out.println("Press 2 for Transactions");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                  System.out.println("The balance is : "+acc_balance);
                  break;
                case 2:
                  System.out.println("The transactions are as follows: ");
                  if(transac!=0){
                  for(int i = 0; i<transac;i++){
                    System.out.println(transactions[i]);
                  }
                }
                else{
                    System.out.println("You don't have any transactions until now.");
                }
            }
            System.out.println();
        }
    }
}
