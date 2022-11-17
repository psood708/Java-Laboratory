

import java.awt.*;
import java.awt.event.*;

class DBE extends WindowAdapter implements ActionListener{

    Frame frame;
    Label label1;
    TextField field1;
    Button button1, button2, button3;
    Dialog d1, d2, d3;

DBE(){
frame = new Frame("Dialog Box");
button1 = new Button("Open Dialog Box");
label1 = new Label("Click on the button to open the Dialog Box");
frame.add(label1);
frame.add(button1);
button1.addActionListener(this);
frame.pack();
frame.setLayout(new FlowLayout());
frame.setSize(330,250);
frame.setVisible(true);
    }

public void actionPerformed(ActionEvent ae){
if(ae.getActionCommand().equals("Open Dialog Box")){

d1 = new Dialog(frame,"ModalDialog",true);
            Label label= new Label("This is the Dialog Box.",Label.CENTER);
d1.add(label);
d1.addWindowListener(this);
d1.pack();
d1.setLocationRelativeTo(frame);
d1.setLocation(new Point(100,100));
d1.setSize(400,200);
d1.setVisible(true);
        }
    }
}

public class dialogbox{
public static void main(String args[]){
new DBE();
    }
}

