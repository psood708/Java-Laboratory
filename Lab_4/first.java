import java.util.Scanner;
class first{
  public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the word: ");
       String str = sc.nextLine();
       int count_v=0,space=0;
       char [] vowels = {'a','e','i','o','u','A','E','I','O','U'};
      //  char [] input = str.toCharArray();
       for(int i =0;i<str.length();i++){
        if(str.charAt(i)==' '){
          space++;
        }
        for(char v:vowels){
            if(v==str.charAt(i)){
                count_v++;
            }   
        }
      }
      System.out.println("Total Vowels are: "+count_v);
      System.out.println("Total Consonants are: "+(str.length()-count_v-space));
}
}