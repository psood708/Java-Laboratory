import java.util.Scanner;

public class sp_ques {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str1 = sc.nextLine();
    System.out.print("Enter number of lines: ");
    // we need to keep len_str < lines
    int lines = sc.nextInt();
    char[] new_str = str1.toCharArray();
    int len_str = new_str.length;
    int space = lines;
    int space1 = lines;
    System.out.println(new_str);
    if (len_str <= lines) {
      // this first for loop is for the lines that program will print
      for (int i = 0; i < lines; i++) {
        if (i % 2 == 0) {
          // this is for even indexAB
          for (int k = 0; k < i + 1; k++) {
            // this for loop is for determining number of *
            if (k == 0) {
              // this if is for only giving spacing on the first *
              for (int j = 0; j < space; j++) {
                // this for loop will give the spacing
                System.out.print(" ");
              }
            }
            System.out.print("* ");
          }
          System.out.println();
        } else {
          // this is for odd index
          for (int q = 0; q < i + 1; q++) {
            // this is for getting the elements from character array
            if (q == 0) {
              for (int m = 0; m < space; m++) {
                System.out.print(" ");
              }
            }
            if (q > len_str - 1) {
              // this is the condition for repetition of the same elements when we run out of
              // elements to print
              System.out.print(new_str[q % len_str] + " ");
            } else if (q < len_str) {
              // this is the normal condition where it will print the elements
              System.out.print(new_str[q] + " ");
            }
          }
          System.out.println();
        }
        System.out.println();
        space--;
      }
    } else {
      System.out.println("Please check Your Input again!! This will cause Trouble!");
    }
    // we'll keep odd lines as * and even lines as these ABCD
    // this is to repeat the same in reverse
    if (len_str <= lines) {
      // this first for loop is for the lines that program will print
      for (int i = lines - 2; i >= 0; i--) {
        if (i % 2 == 0) {
          // this is for even index
          for (int k = 0; k < i + 1; k++) {
            // this for loop is for determining number of *
            if (k == 0) {
              // this if is for only giving spacing on the first *
              for (int j = space1 - i; j > 0; j--) {
                // this for loop will give the spacing
                System.out.print(" ");
              }
            }
            System.out.print("* ");
          }
          System.out.println();
        } else {
          // this is for odd index
          for (int q = 0; q < i + 1; q++) {
            // this is for getting the elements from character array
            if (q == 0) {
              for (int m = space1 - i; m >= 0; m--) {
                System.out.print(" ");
              }
            }
            if (q > len_str - 1) {
              // this is the condition for repetition of the same elements when we run out of
              // elements to print
              System.out.print(new_str[q % len_str] + " ");
            } else if (q < len_str) {
              // this is the normal condition where it will print the elements
              System.out.print(new_str[q] + " ");
            }
          }
          System.out.println();
        }
        System.out.println();
        space1--;
      }
    } else {
      System.out.println("Please check Your Input again!! This will cause Trouble!");
    }
  }
}
