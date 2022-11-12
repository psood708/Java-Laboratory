import java.util.Scanner;
public class add_two_num {
    static int[] element_array(int n){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[n];
        System.out.print("Enter "+ n + "elements: ");
        for(int j = 0;j<n;j++){
            int ele = sc.nextInt();
            arr[j]=ele;
        }
        return arr;
    }
    static void calc_array(int[]arr_1,int[]arr_2){
        int l1 = arr_1.length;
        int l2 = arr_2.length;
        int[] fin = new int[l1];
        int sum=0,carry=0,temp = 0;
        for(int k = 0; k<l1;k++){
            if(k>l2){
             sum =arr_1[k] + arr_2[k]+carry;
             if(sum>9){
               fin[k] = (sum)%10;
               carry = sum/10;
             } 
             else{
                fin[k]=sum;
                carry = 0;
             }
            }
            else{
                System.out.print(fin[k]);
                fin[k]=arr_1[k]+carry;
            }
        }
       
         
        System.out.print("Final Answer: ");
        for(int ans:fin){
            System.out.print(ans+"-");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of elements in arr_1: ");
        int n1 = sc.nextInt();
        int[]arr_1 = element_array(n1);
        System.out.print("No. of elements in arr_2: ");
        int n2 = sc.nextInt();
        int[]arr_2 = element_array(n2);
        calc_array(arr_1, arr_2);
    }
}
