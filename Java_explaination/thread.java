import java.util.*;
import java.lang.*;
public class thread{
    static class ThreadTest extends Thread{
      public void run(){
       
        System.out.println("We are inside thread function.."+ Thread.currentThread().getName()+ "\nThread Priority: "+Thread.currentThread().getPriority());
        // System.out.println(Thread.currentThread().getName());  
    }
    }
//     public class a extends ThreadTest{
//         public void run(){
//        int i=3;
//       while(i>3){
//         System.out.println("A: "+ i);
//       }
//     }
// }
//     public class b extends ThreadTest{
//         public void run(){
//         int j=3;
//         while(j>3){
//           System.out.println("B: "+ j);
//         }
//       }
//     }

//       public class c extends ThreadTest{
//        public void run(){
//         int k=3;
//         while(k>3){
//           System.out.println("A: "+ k);
//         }
//     }
//       }

    public static void main(String[]args){
      
    //   a A = new a();
    //   b B = new b();
    //   c C = new c();
      ThreadTest t1 = new ThreadTest();
      ThreadTest t2 = new ThreadTest();
      ThreadTest t3 = new ThreadTest();

      System.out.println("t1 prioirity: "+t1.getPriority());
      System.out.println("t2 priority: "+t2.getPriority());
      System.out.println("t3 priority: "+t3.getPriority());
      System.out.println(Thread.currentThread().getName());  
      t1.setPriority(3);
      t2.setPriority(4);
      t3.setPriority(9);
     
      System.out.println("t1 prioirity: "+t1.getPriority());
      System.out.println("t2 priority: "+t2.getPriority());
      System.out.println("t3 priority: "+t3.getPriority());
      t1.start();
      t2.start();
      t3.start();
    
    //   System.out.println("t1 priority: ",t1.getPriority());
    }



}