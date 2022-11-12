import java.util.Scanner;
class second {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    int count_num = 0;
    String new_inp = str.replaceAll("\\s+", "k");
    char[] input = new_inp.toCharArray();
    for(int i = 0;i<input.length;i++){
        char c = Character.toUpperCase(input[i]);
        if((input[i]==c) &&((input[i-1]=='k') || i==0)) {
          count_num++;
        }
    }
    System.out.println(count_num +" Words start with a Capital letter");
}
}
