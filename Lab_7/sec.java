import java.util.Scanner;

public class sec {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Feet: ");
           int feet = sc.nextInt();
           System.out.print("Inches: ");
           int inches = sc.nextInt();  
        Distance2 dist  = new Distance2(feet,inches) ;
        dist.leng();
        Distance2 dist1 = new Distance2(dist.feet,dist.inches);
        dist1.leng();
        Distance2 dist2 = new Distance2(dist1.feet,dist1.inches);
        dist2.leng();

    } 
    static class Distance2{
        Scanner sc = new Scanner(System.in);
        int feet;
        int inches;

        Distance2(int feet,int inches){
            this.feet = feet;
            this.inches = inches;
        }
        public void leng(){
            System.out.println("Feet: "+this.feet + " Inches: "+this.inches);
        }
    }
}
