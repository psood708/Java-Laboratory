import java.util.Scanner;

public class fir { 
    public static void main(String[] args) {
        Distance d1 = new Distance();
        double dist = d1.fun1();
        System.out.println("Foot: " + dist * 3.28);
        System.out.println("Inches: " + dist * 3.28 * 12);
    }
} 

class Distance {
    public double fun1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First 'METRES' then 'CENTIMETRES'");
        System.out.println("Metres: ");
        int mtr = sc.nextInt();
        System.out.println("Centimetres: ");
        int cms = sc.nextInt();
        double res = mtr + ((float) cms / 100);
        return res;
    }
    // 12 inches is 1 foot
};
