// package Lab_9;

public class ninth { 
    public static void main(String[]args){
     
     a cl_ss = new a();
     System.out.println("Calling method from object of 'a'");
     cl_ss.print_a();
     System.out.println();     
     b sing_inher = new b();
     System.out.println("Calling method from object of 'b'");
     sing_inher.print_b();
     System.out.println();
     c mult_inher = new c();
     System.out.println("Calling method from object of 'c'");
     mult_inher.print_c();
     System.out.println();
     d hier_inher = new d();
     System.out.println("Calling method from object of 'd'");
     hier_inher.print_d();
    }
    public static class a{
       static void print_a(){
          System.out.println("Inside of 'a' class");
          System.out.println("End of method of 'a' class");
      }
    }
    public static class b extends a{
        static void print_b(){
            System.out.println("Inside 'b' class");
            System.out.println("Calling method of parent class 'a'");
            print_a();
            System.out.println("End of method of 'b' class");
        }
    }
    public static class c extends b{
        static void print_c(){
              System.out.println("Inside 'c' class");
              System.out.println("Calling method of parent class 'b'");
              print_b();
              System.out.println("Calling method of grandparent class 'a'");
              print_a();
              System.out.println("Ending method of 'c' class");
        }
    }
    public static class d extends a{
        static void print_d(){
            System.out.println("Inside 'd' class");
            System.out.println("Callling method of parent class 'a' ");
            print_a();
            System.out.println("End of method 'd' class");
        }
    }
}
