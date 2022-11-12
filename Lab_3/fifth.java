import java.util.Scanner;
public class fifth {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        int i =0;
        int j=0;
        int max = 0;
        while(i<3){
            System.out.print("Enter the number: ");
            int n1 = sc.nextInt();
            arr[i] = n1;
            j = max < arr[i] ? max = arr[i] : max;
            i++;
        }
        System.out.println(j);
    }
}
