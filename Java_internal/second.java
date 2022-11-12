// import java.util.*;

// public class second {

//     class course {
//         Scanner sc = new Scanner(System.in);
//         int course_code;
//         String course_name;
//         double marks;

//         course( int cc, String cn,double mark) {
//             course_code = cc;
//             course_name = cn;
//             marks = mark;
//         }

//     }

//     class student extends course {
//         Scanner sc = new Scanner(System.in);
//         int roll_no;
//         String name;
//         int course_codee;
//         String course_namee;
//         double markss;
//         static double highest_marks;
//         double total_marks;

//         student( String name, int roll) {
            
            
//             // course c1 = new course(course_codee, course_namee, markss);
             
//             // System.out.print("Enter your name: ");
//             // this.name = sc.nextLine();
//             // System.out.print("Enter your roll number: ");
//             // this.roll_no = sc.nextInt();
           
          

//         }
//         // void enterCourse(){
//         //     System.out.print("Enter the course Name: ");
//         //     course_namee = sc.nextLine();
//         //     System.out.print("Enter course code: ");
//         //     course_codee = sc.nextInt();
//         //     System.out.print("Marks in this course: ");
//         //     markss = sc.nextDouble();
//         // }
//     }
// }


public class second {
    static class Course {
        String courseName;
        int courseCode;
        double marks;
    
        Course(String cname, double m , int c) {
            courseName = cname;
            marks = m;
            courseCode = c;
        }
     
    }
    static class Student {
        String name;
        double total_marks;
        int roll_no;
    
        Student(String namee, int roll_noo, String c1, String c2, String c3, double m0, double m1, double m2,int cc1,int cc2,int cc3) {
            new Course(c1, m0,cc1);
            new Course(c2, m1,cc2);
            new Course(c3, m2,cc3);
            
            name = namee;
            roll_no = roll_noo;
            total_marks = m0 + m1 + m2;
            
        }
        void display() {
            System.out.println("Name: "+name +" Roll no.: "+ roll_no +"  ");
        }
    }
    static void Highest_marks(Student[] a){
        double highest = 0;
        int student=0 ;
        for(int i = 0;i<10;i++){
             if(a[i].total_marks > highest){
                     highest = a[i].total_marks;
                     student = i;
                    
             }
             else{
                continue;
                
             }
        }
        System.out.println("Highest marks: "+ highest);
        a[student].display();

    }
    public static void main(String[] args) {
        Student[] S1 = new Student[10];
        //Student objects
        S1[0] = new Student("Student1",1,"DSA","DMS","OOJP",40,90,85,123,134,145);
        S1[1] = new Student("Student2",2,"DSA","DMS","OOJP",50,80,50,123,134,145);
        S1[2] = new Student("Student3",3,"MPI","DMS","OOJP",80,50,20,111,134,145);
        S1[3] = new Student("Student4",4,"DSA","MPI","OOJP",20,60,30,123,111,145);
        S1[4] = new Student("Student5",5,"DSA","DMS","MPI",40,50,50,123,134,111);
        S1[5] = new Student("Student6",6,"DSA","DMS","OOJP",50,90,60,123,134,145);
        S1[6] = new Student("Student7",7,"MPI","DMS","OOJP",80,30,20,111,134,145);
        S1[7] = new Student("Student8",8,"DSA","MPI","OOJP",90,50,80,123,111,145);
        S1[8] = new Student("Student9",9,"DSA","DMS","OOJP",10,20,50,123,134,145);
        S1[9] = new Student("Student10",10,"MPI","DMS","OOJP",90,10,80,111,134,145);
        Highest_marks(S1);
    }
}