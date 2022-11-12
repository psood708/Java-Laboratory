import java.util.*;
public class DivideByZero {
    public static void main(String[]args)   {
        int x,y;
        Scanner sc = new Scanner(System.in);
           try{
            System.out.print("Enter First Num: ");
            x = sc.nextInt();
            System.out.print("Enter Second Num: ");
            y = sc.nextInt();
            System.out.println("Division is: "+(x/y));
           }
           catch(ArithmeticException e) {
            System.out.println("Denominator Cannot be Zero while Integer Division");
           }
    }
}
