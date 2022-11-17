import java.awt.*;
import java.awt.event.*;
public class push_btn {
    public static void main(String[]args){
        Frame f = new Frame("Button");
        final TextField tf = new TextField();
        tf.setBounds(50,100,60,30);
        Button b = new Button("Button");
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("You have pressed the button");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
