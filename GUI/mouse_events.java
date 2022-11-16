 
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputListener;

public class mouse_events {
    public static class MouseListener extends Frame implements MouseInputListener{
        MouseListener(){
            addMouseListener(this);
            setSize(500, 500);
            setVisible(true);
        }
        public void mouseClicked(MouseEvent e){
            this.setBackground(Color.darkGray);
            System.out.println("CLicked-1");
        }
        public void mouseEntered(MouseEvent e){
            this.setBackground(Color.GRAY);
            System.out.println("Entered");
        }
        public void mouseExited(MouseEvent e){
            this.setBackground(Color.BLUE);
            System.out.println("Exited");
        }
        public void mousePressed(MouseEvent e){
            this.setBackground(Color.ORANGE);
            System.out.println("Pressed");
        }
        public void mouseReleased(MouseEvent e){
            this.setBackground(Color.GREEN);
            System.out.println("Released");
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            this.setBackground(Color.MAGENTA);
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            this.setBackground(Color.BLACK);
            
        }
    }
    public static void main(String[]args){
        new MouseListener();
    }
}
