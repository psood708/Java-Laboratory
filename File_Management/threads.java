import java.util.*;

public class threads {
    static Scanner sc = new Scanner(System.in);
    static class tr extends Thread{
         public void run(){
            System.out.println("We are in "+tr.currentThread().getName());
         }
    }
    public static void main(String[]args){
       tr t1 = new tr();
       tr t2 = new tr();
       System.out.print("Enter name for 1st thread: ");
       String x = sc.nextLine();
       System.out.print("Enter name for 2nd thread: ");
       String y = sc.nextLine();
       t1.setName(x);
       t2.setName(y);
    //    System.out.println(t1.getName());
       t1.run();
       t1.start();
       t2.run();
       t2.start();
    //    t2.run();pr
    }
}
