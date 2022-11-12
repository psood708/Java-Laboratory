import java.util.Scanner;
public class first {
    //for area of circle
    static float area(float c){
      return (float)(c*c*3.14);
    }
    //this is for square
    static int area(int a){
         return a*a;
    }
    //this is for rectangle
    static int area(int a,int b){
          return a*b;
    }
    //this is for triangle
    static float area(float d,int c){
        return (float)(c*d*0.5);
    }
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Press '1' for area of Circle ");
         System.out.println("Press '2' for area of Square ");
         System.out.println("Press '3' for area of Rectangle ");
         System.out.println("Press '4' for area of  Triangle");
         int n = sc.nextInt();
         switch(n){
            case 1:
             System.out.print("Enter the radius: ");
             float r = sc.nextFloat();
             System.out.println(area(r)); 
             break;
            case 2:
             System.out.print("Enter the length of side: ");
             int side = sc.nextInt();
             System.out.println(area(side));
             break;
            case 3:
             System.out.print("Enter the height of rectangle: ");
             int n1 = sc.nextInt();
             System.out.print("Enter the width of rectangle: ");
             int n2 = sc.nextInt();
             System.out.println(area(n1,n2));
             break;
            case 4:
             System.out.print("Enter the height of the triangle: ");
             int q1 = sc.nextInt();
             System.out.print("Enter the length of the base: ");
             int q2 = sc.nextInt();
             System.out.println(area(q1,q2));
             break;

         }
         sc.close();
    }   
}
