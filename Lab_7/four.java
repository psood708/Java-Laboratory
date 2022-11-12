import java.util.Scanner;
public class four {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Factorial: ");
        int num = sc.nextInt();
        System.out.print("Enter two numbers for Product: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
           
        mulitConstructor mc = new mulitConstructor(num);
        mulitConstructor mc1 = new mulitConstructor(num1,num2);
        System.out.println("Factorial of given number is: "+mc.fact);
        System.out.println("Product of given number is: "+mc1.prod);
        
    } 
    public static class mulitConstructor{
        int fact;
        int prod;
        mulitConstructor(int num){
            this.fact=  fact(num);

        }
        mulitConstructor(int num,int num1){
            this.prod = num*num1;
        }
        public static int fact(int n){
            if(n<=1){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
         
    }
}

