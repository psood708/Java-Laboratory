import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;
public class box_layout {
public static void main(String[] args)
    {
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame = new JFrame("BoxLayout");
JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5;
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
panel.setLayout(boxlayout);
panel.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
jbtn1 = new JButton("Button 1");
jbtn2 = new JButton("Button 2");
jbtn3 = new JButton("Button 3");
jbtn4 = new JButton("Button 4");
jbtn5 = new JButton("Button 5");
panel.add(jbtn1);
panel.add(jbtn2);
panel.add(jbtn3);
panel.add(jbtn4);
panel.add(jbtn5);
frame.add(panel);
frame.pack();
frame.setVisible(true);
    }
}

