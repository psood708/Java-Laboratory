import java.util.Scanner;

public class pallindrome_num {
    static boolean p_check(int x) {
        int rep = x;
        int check, sum = 0;
        if (x < 0) {
            System.out.println(false);
        } else {
            while (x > 0) {
                check = x % 10;
                sum = (sum * 10) + check;
                x = x / 10;
            }
        }
        if (sum == rep)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(p_check(x));

    }

}