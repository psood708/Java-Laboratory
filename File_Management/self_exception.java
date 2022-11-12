import java.util.*;
public class self_exception {
    static Scanner sc = new Scanner(System.in);
    public static void sum(int a, int b) throws SelfException{
       if(a%2==1){
        throw new SelfException(a);
       }
       else if(b%2==1){
        throw new SelfException(b);
       }
       else{
        System.out.println(a+b);
       }
    }
    public static void main(String[]args){
        try{
            sum(10,7);
        }
        catch(SelfException l){
            System.out.println(l);
        }
    }
    public static class SelfException extends Exception{
        private int n;
        SelfException(int a){
            n = a;
        }
        public String toString(){
            return "[" + n +"] is odd number";
        }
    }
}
