import java.util.Scanner;
// import javax.sound.sampled.SourceDataLine;
import java.lang.Math;
public class second {
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println(" '#' for root , 'p' for power, 'l'  for logrithm , 's' for sine , 't' for tan ,'r' for radian ");
  String ne = sc.nextLine();
  switch(ne.charAt(0)){
    case '#':
     System.out.print("Enter the number you want the root of: ");
     int a = sc.nextInt();
     System.out.println(Math.sqrt(a)); 
     break;
    case 'p':
     System.out.print("First enter the number and then it's power: ");
     int b = sc.nextInt();
     int c = sc.nextInt();
     System.out.println(Math.pow(b, c)); 
     break;
    case 'l':
     System.out.print("Enter number you want log of: ");
     int lg = sc.nextInt();
     System.out.println(Math.log(lg)); 
     break;
    case 's':
     System.out.print("Enter number you want log of: ");
     double s = sc.nextDouble();
     System.out.println(Math.sin(s)); 
     break;
    case 't':
     System.out.print("Enter to find out tan for variable: ");
     double t = sc.nextDouble();
     System.out.println(Math.tan(t));
     break;
    case 'r':
     System.out.print("Enter to find out radian for variable: ");
     double r = sc.nextDouble();
     System.out.println(Math.toRadians(r)); 
     break;
  }
  sc.close();
 }   
}
