import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class firsst_gui {
        public static void main(String[]args){
        JframeDemo firstJframe = new JframeDemo(); 
    }
    public static class JframeDemo extends JFrame implements WindowListener{
      JframeDemo(){
           this.setSize(600, 550);
           this.setVisible(true);
           this.addWindowListener(this);
      }
      @Override
      public void windowOpened(WindowEvent e){
        System.out.println("You opened a frame!!");
      }
      @Override
      public void windowClosing(WindowEvent e){
        System.out.println("CLosing Frame");
        dispose();
      }
      @Override
      public void windowIconified(WindowEvent e){
          System.out.println("This is an icon");
      }
      @Override
      public void windowDeiconified(WindowEvent e){
        System.out.println("Deiconified");
      }
      @Override
      public void windowActivated(WindowEvent e){
        System.out.println("Activated!!");
      }
      @Override
      public void windowDeactivated(WindowEvent e){
        System.out.println("Deactivatedd");
      }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("This window is closed!");
    }
    }
}
