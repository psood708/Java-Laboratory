import java.util.Scanner;
public class third {
    public static void main(String[]args){
        String str_ex = " ";
        while(str_ex.equals("quit")==false){
            int a=0,e=0,i_1=0,o=0,u=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the word: ");
            String str = sc.nextLine();
            for(int i =0;i<str.length();i++){
                if(str.charAt(i)=='A' || str.charAt(i)=='a'){
                    a+=1;
                }
                else if(str.charAt(i)=='E' || str.charAt(i)=='e'){
                    e+=1;
                }
                else if(str.charAt(i)=='I' || str.charAt(i)=='i'){
                    i_1+=1;
                }
                else if(str.charAt(i)=='O' || str.charAt(i)=='o'){
                    o+=1;
                }
                else if(str.charAt(i)=='U' || str.charAt(i)=='u'){
                    u+=1;
                }
       }
       System.out.print("a:"+a+" ");
       System.out.print("e:"+e+" ");
       System.out.print("i:"+i_1+" ");
       System.out.print("o:"+o+" ");
       System.out.println("u:"+u+" ");
       System.out.println("Enter 'quit' if you want to end..");
       str_ex = sc.nextLine();
    }
 }
}
