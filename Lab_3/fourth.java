import java.util.Scanner;
public class fourth {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total no. of subjects:");
        int n = sc.nextInt();
        int perc = 0;
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter the value for subject "+(i+1)+":");
            int n1 = sc.nextInt();
            arr[i] = n1;
            perc = perc + arr[i];
        }
        System.out.print("Percentage:"+((float)perc/(n*100))*100);
    }
}
