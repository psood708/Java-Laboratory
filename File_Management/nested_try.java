import java.util.*;
public class nested_try {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        try{
            int[] a= new int[]{1,2,3,4,5};
            for(int i =0;i<5;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("\nYou have cleared first Try Block");
            try{
                for(int i=0;i<5;i++){
                    System.out.print(a[i]/2 +" ");
                }
                System.out.println("\nYou have cleared second Try Block");
            }
            catch (ArithmeticException e){
                System.out.println("You tried to divide by zero");
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArray Index is out of the bonds of your array.");
        }
    }
}
