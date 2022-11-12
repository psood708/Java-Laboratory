import java.util.*;
import java.lang.*;
public class thread_priority{
    static class ThreadTest extends Thread{
      public void run(){
        System.out.println("We are inside thread function.."+ Thread.currentThread().getName()+ "\nThread Priority: "+Thread.currentThread().getPriority());
    }
}
    public static void main(String[]args){
      ThreadTest t1 = new ThreadTest();
      ThreadTest t2 = new ThreadTest();
      ThreadTest t3 = new ThreadTest();
      System.out.println("t1 prioirity: "+t1.getPriority());
      System.out.println("t2 priority: "+t2.getPriority());
      System.out.println("t3 priority: "+t3.getPriority());
      t1.setPriority(3);
      t2.setPriority(4);
      t3.setPriority(9);
      System.out.println("t1 prioirity: "+t1.getPriority());
      System.out.println("t2 priority: "+t2.getPriority());
      System.out.println("t3 priority: "+t3.getPriority());
      t1.start();
      t2.start();
      t3.start();
      t1.run();
      t2.run();
      t3.run();
    }
}