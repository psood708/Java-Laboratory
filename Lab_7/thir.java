import java.util.Scanner;

public class thir {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = sc.nextLine();
        System.out.print("Enter age: ");
        int b = sc.nextInt();
        char c = 'M';
        System.out.print("Enter subject: "+c);
        System.out.println();
        Teacher t1 = new Teacher(b,a,c);
        t1.emp_data();
        t1.teac_data();

    }
    static class Employee{ 
       int age;
       String name;
       Employee(int a, String b){
        this.age = a;
        this.name = b;
       }
       public void emp_data(){
          System.out.println("Name of Employee: "+name);
          System.out.println("Age of Employee: "+age);
       }
    }
    static class Teacher extends Employee{
        char subj;
        Teacher(int a, String b,char c){
            super(a,b);
            this.subj =c;
        }
        public void teac_data(){
            System.out.println("Name of Teacher: "+name);
            System.out.println("Age of Teacher: "+age);
            System.out.println("Subject of Teacher: "+subj);
        }
    }
    
}
