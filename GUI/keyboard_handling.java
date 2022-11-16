import java.awt.*;
import java.awt.event.*;
public class keyboard_handling{
public static class Key extends Frame implements KeyListener{
      Key(){
        setSize(500, 500);
        setVisible(true);
        this.addKeyListener(this);
      }
    @Override
    public void keyTyped(KeyEvent e) {
        this.setBackground(Color.GREEN);
        System.out.println("You typed!!");   
    }
    @Override
    public void keyPressed(KeyEvent e) {
        this.setBackground(Color.MAGENTA);
        System.out.println("Key is Pressed!!");        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        this.setBackground(Color.darkGray);
        System.out.println("Released");   
    }   
}
public static void main(String[]args){
    new Key();
}
}