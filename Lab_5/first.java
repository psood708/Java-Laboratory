import java.util.Scanner;
public class first {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String word = sc.nextLine();
        char[]new_str = word.toCharArray();
        int len = word.length();
        int space = len;
        for(int i = 0; i<len;i++){
            for(int j = 0;j<i+1;j++){
                if(j==0){
                for (int k = 0;k<space;k++){
                    System.out.print(" ");
                }
               }
                System.out.print(new_str[j]+" ");
            }
            space--;
            System.out.println();   
        }
    }    
}
