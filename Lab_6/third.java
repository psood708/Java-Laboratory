import java.util.Scanner;

import org.w3c.dom.ElementTraversal;
public class third {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int elements = sc.nextInt();
        int temp = 0;
        int [] arr = new int[elements];
        for(int j =0;j<elements;j++){
            System.out.print("Enter element: ");
            int m = sc.nextInt();
            arr[j]=m;
        } 
        for (int j :arr) {
            System.out.print(j + " ");
        }
        for(int k = 0;k<elements;k++){
            for(int m = k+1; m<elements;m++){
            if(arr[k]>arr[m]){
                temp=arr[k];
                arr[k]=arr[m];
                arr[m]=temp;
            } 
        }
        }
        System.out.println();
        System.out.print("Sorted Array is: ");
        for (int l : arr) {
            System.out.print(l+" ");
        }
        sc.close();
    }
}
