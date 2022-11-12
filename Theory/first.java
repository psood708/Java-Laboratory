public class first {
   
  
    public static void main(String[]args){
        CEClass div8 = new CEClass();
        div8.sem = 3;
        div8.no_of_students=70;
        div8.uni_name="PDEU";



  }   
}
class CEClass{
    String uni_name;
    int sem;
    int no_of_sub;
    int no_of_students;
    CEClass(){
        System.out.println("It is my constructor");
    }
}