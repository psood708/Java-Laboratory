import java.util.Scanner;
public class third {
    //This is the second program
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two numbers:");
     int n = sc.nextInt();
     int n1 = sc.nextInt();
     System.out.println("Addition: "+(n+n1));
     System.out.println("Subtraction: "+(n-n1));
     System.out.println("Multiplication: "+(n*n1));
     System.out.println("Divison: "+((float)n/(float)n1));
    }
}
