import java.util.Scanner;
public class fourth {
    static void printMatrix(int q,int o,int[][] arr){
        Scanner sc = new Scanner(System.in);
        for(int k =0;k<q;k++){
            for(int j = 0 ; j<o;j++){
               int p = sc.nextInt();
               arr[k][j]=p;
               System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void multMatrix(int q, int o,int[][] arr_1,int[][] arr_2){
        // int[][] fin = new int[q][o];
        int [][] ans = new int[q][o] ;
        for(int k =0;k<q;k++){
            for(int j = 0 ; j<o;j++){
                for(int l = 0;l<q;l++){
                   ans[k][j]+=arr_1[k][l]*arr_2[l][j]; 
                }
            }
        }
        for(int m = 0;m<q;m++){
            for(int t = 0;t<o;t++){
                System.out.print(ans[m][t] +" ");
            }
            System.out.println();
      }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix Dimension: ");
        int q = sc.nextInt();
        int o = sc.nextInt();
        System.out.println("Dimension: "+q+" "+o);
        int [][] arr_1 = new int[q][o];
        int [][] arr_2 = new int[q][o];
        System.out.println("Enter the 1st Matrix: ");
        printMatrix(q,o,arr_1);
        System.out.println("Enter the 2nd Matrix: ");
        printMatrix(q,o,arr_2);
        System.out.println("Multiplication of entered numbers is:");
        multMatrix(q, o, arr_1, arr_2);
        sc.close();
    }
}
