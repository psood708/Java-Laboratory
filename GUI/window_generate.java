import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

 class JFramexam extends JFrame implements WindowListener{
    JFramexam(){
       this.setSize(500, 500);
       this.setVisible(true);
       this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened!!");
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closedd");
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("CLoseee");
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
      System.out.println("Minimized");
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Maximized");
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("I am In");
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("I am out");
        
    }
}
public class window_generate {
    public static void main(String[]args){
    JFramexam test = new JFramexam();
    }
}

