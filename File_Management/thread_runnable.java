import java.io.*;
import java.util.*;
public class thread_runnable {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
          
        Run_exm runn = new Run_exm();
        Thread t1 = new Thread(runn,"New thread");
        t1.start();
        t1.run();
    }
     public static class Run_exm implements Runnable{
        public void run(){
            System.out.println( "The name of this thread is : "+Thread.currentThread().getName());
        }
    }
}
