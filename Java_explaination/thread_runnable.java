package Java_lab.Java_explaination;
import java.util.*;
import java.lang.*;
public class thread_runnable{
static  class t_r implements Runnable{  
    public void run(){  
    // System.out.println("thread is running..."
    System.out.println("We are inside thread function.."+ Thread.currentThread().getName()+ "\nThread Priority: "+Thread.currentThread().getPriority());
    }  
      
    public static void main(String args[]){  
    t_r m1=new t_r();  
    t_r m2=new t_r();  
    t_r m3=new t_r();  
    Thread t1 =new Thread(m1); 
    Thread t2 =new Thread(m2);
    Thread t3 =new Thread(m3);    // Using the constructor Thread(Runnable r)  
    t1.start();  
    t2.start();
    t3.start();
     }  
    
    
    
}   
}
    
