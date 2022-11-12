import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class two_sum {
    static void sum(int[] arr, int target) {
        int leng = arr.length;
        int valid = 0;
        for (int i = 0; i < leng; i++) {
            for (int j = i; j < leng; j++) {
                if (arr[i] + arr[j] == target && (i != j)) {
                    System.out.println("[" + i + "," + j + "]");
                    break;
                }
            }
            valid++;
        }
        
        if (valid == leng ) {
            System.out.print(target + ":Doesn't match with sum of two numbers of the elements");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 7, 11, 15 };
        System.out.print("Enter the target: ");
        int targ = sc.nextInt();
        sum(arr, targ);
    }
}
