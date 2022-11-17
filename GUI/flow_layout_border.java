import java.awt.*;
import javax.swing.*;
public class flow_layout_border{
JFrame frameObj;
flow_layout_border() {
frameObj = new JFrame();
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
JButton b10 = new JButton("10");
JButton n = new JButton("North");
JButton s = new JButton("South");
JButton c = new JButton("Center");
JButton w = new JButton("West");
JButton e = new JButton("East");
b1.setBackground(Color.GREEN);
b10.setBackground(Color.ORANGE);
frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);
frameObj.add(b5); frameObj.add(b6); frameObj.add(b7); frameObj.add(b8);
frameObj.add(b9); frameObj.add(b10);
frameObj.setLayout(new FlowLayout());
frameObj.setSize(400, 300);
frameObj.setVisible(true);
}
 
public static void main(String args[]) {
new flow_layout_border();
} }