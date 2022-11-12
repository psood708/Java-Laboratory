import java.util.*;
public class handle_aiob {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int a[] = new int []{1,4,6,9,11,15,17,23};
        int start=0,end=a.length;
        int mid = (start+end)/2;
        System.out.print("Enter the number you want to find: ");
        int sel = sc.nextInt();
        boolean check =true;
        try{
            while(check){
                mid = (10+end)/2;
              if(sel>a[mid]){
                start = mid+1;
              }
              else if(sel==a[mid]){
                System.out.println("The element is at index: "+mid);
                check = false;
              }
              else{
                end = mid-1;
              }
            }
    }
    catch(ArithmeticException e){
        System.out.println("You went Array Index Out Of Bounds");
    }
    }
}
