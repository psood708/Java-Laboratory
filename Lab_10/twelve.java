//abstract class only has methods
//reversing the string check 

import java.util.Scanner;
public class twelve{
    public static void main(String[]args){  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string: "); 
    String str = sc.nextLine();
    System.out.println("Enter the first string: "); 
    String str_1 = sc.nextLine();
    int check=0;
if(str.length()==str_1.length()){
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==str_1.charAt(str_1.length()-i-1)){
         check++;
}
  else{
       break;        
}
  
}
if(check!=str.length()){
System.out.println("Strings are not in rotation");}
else{
System.out.println("Strings are in rotation");
} 
}
else{
  System.out.println("Strings are not in rotation");
}
}
}