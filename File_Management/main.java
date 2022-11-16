import java.awt.*;     

import java.awt.event.*;     

 

class KeyListenerExample extends Frame implements KeyListener {     

 

// KeyListenerExample  {     

 

setSize (400, 400);        

(true);   

this.addKeyListener(this);   

    }     

public void keyPressed (KeyEvente) {     

this.setBackground(Color.ORANGE); 

System.out.println("key pressed");     

    }     

 

public void keyReleased (KeyEvente) {     

this.setBackground(Color.RED);  

System.err.println("key released");      

    }     

 

public void keyTyped (KeyEvente) {     

this.setBackground(Color.GREEN);    

System.out.println("key tapped");   

    }         

} 

 

public class main{ 

public static void main(String[] args) {     

newKeyListener Example();     

    } 

}

 