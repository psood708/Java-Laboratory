import java.awt.*;
import java.awt.event.*;
class StuDetails extends Frame {
Label l1;
Label l2;
Label l3;
Label l4;
Label l5;
Label l6;
StuDetails() {
super("Student Details");
l1 = new Label("Name: Parth Sood");
l2 = new Label("Roll No: 21BCP252");
l3 = new Label("Marks in DMS: 90");
l4 = new Label("Marks in DSA: 93");
l5 = new Label("Marks in MPI: 98");
l6 = new Label("Marks in DECO: 89");
l1.setBounds(25, 50, 250, 30);
l2.setBounds(25, 100, 250, 30);
l3.setBounds(25, 150, 250, 30);
l4.setBounds(25, 200, 250, 30);
l5.setBounds(25, 250, 250, 30);
l6.setBounds(25,300,250,30);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(l4);
this.add(l5);
this.add(l6);
this.setBackground(Color.orange);
this.setSize(400, 400);
this.setLayout(null);
this.setVisible(true);
this.addWindowListener (new WindowAdapter() {
   public void windowClosing (WindowEvent e) {
   dispose();
}
});
} 
}
public class student_info{
    public static void main(String[] args) {
    new StuDetails();
    }
}

