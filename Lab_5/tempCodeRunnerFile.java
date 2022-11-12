    import java.util.Scanner;
    public class second {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of lines:");
            int lines = sc.nextInt();
            int space = lines;
            for(int i = 0; i<lines;i++){
                for(int j = 0;j<i+1;j++){
                    if(j==0){
                    for (int k = 0;k<space;k++){
                        System.out.print(" ");
                    }
                }
                    System.out.print("* ");
                }
                space--;
                System.out.println();   
            }
            for(int i = lines-2; i>=0;i--){
                int space1 = lines;
                for(int j = 0;j<i+1;j++){
                    
                    if(j==0){
                    for (int k = space1-i;k>0;k--){
                        System.out.print(" ");
                    }
                }
                    System.out.print("* ");
                }
                space1--;
                System.out.println();   
            }
            }
    }    