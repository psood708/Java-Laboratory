import java.util.Scanner;
public class seventh {
    public static void main(String[] args) {
        String str = "JAVA";
        Seventh s7 = new Seventh();
        Seventh_1 s1 = new Seventh_1();
        // pass by value
        // pass by reference
        // str = s7.str;
        Seventh_2 s2 = new Seventh_2();
        Seventh_3 s3 = new Seventh_3();
        System.out.println("This is pass by value: ");
        System.out.println("Before: " + s7.str);
        String str_1 = s7.str;
        System.out.println("After: " + str_1);
        System.out.println("This is pass by reference: ");
        System.out.println("Before: " + s1.strt);
        s1.strt = str;
        System.out.println("After: " + s1.strt);
        System.out.println("This is returning Values: ");
        System.out.println("Maximum between 420 and 69: " + s2.max);
        System.out.println("This is returning objects: ");
        s3.obj1();
        s3.obj1();
    }
    public static class Seventh {
        String str = "OOP";
    }
    public static class Seventh_1 {
        String strt = "OOP";
    }
    public static class Seventh_2 {
        int a = 420;
        int b = 69;
        int max = max(a, b);
        static int max(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }
    public static class Seventh_3 {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int min;
        void obj1() {
            this.a = sc.nextInt();
            this.b = sc.nextInt();
            this.min = min(this.a, this.b);
            System.out.println("Minimum among " + this.a + " & " + this.b + " : " + this.min);
        }
        static int min(int a, int b) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }
    }
}
