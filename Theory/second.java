public class second {
    public static void main (String[]args){
    Distance trip1 = new Distance();
    Distance trip_2 = new Distance(56);
    Distance trip_3 = new Distance(34,77);
    }
}
class Distance{
    int sp;
    int ep;
    //this is default constructor
    Distance(){
    sp = 5; ep = 15;
    System.out.println("Your Total Distance is: "+(ep-sp));

    }
    //this is constructor with one default arguments
    Distance(int a){
        ep = a;
        System.out.println("Your Total Distance is: "+(ep-0));
    }
    //this is constructor with two default arguments
    Distance(int a, int b){
        sp = a; ep = b;
        System.out.println("Your Total Distance is: "+(ep-sp));
    }
}
