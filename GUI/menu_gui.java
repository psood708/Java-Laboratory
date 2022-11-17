import java.awt.*;
import java.awt.event.*;
class menu{
    menu(){
        Frame f = new Frame("Menu GUI");
        MenuBar menu_bar = new MenuBar();
        Menu menu = new Menu("Tools");
        Menu sibmenu = new Menu("Extra tools");
        MenuItem Item1 = new MenuItem("R lang");
        MenuItem Item2 = new MenuItem("MATLAB");
        MenuItem Item3 = new MenuItem("LaTeX");
        MenuItem Item4 = new MenuItem("Stata");
        MenuItem Item5 = new MenuItem("JULIA");
        menu.add(Item1);
        menu.add(Item2);
        sibmenu.add(Item3);
        sibmenu.add(Item4);
        sibmenu.add(Item5);
        menu.add(sibmenu);
        menu_bar.add(menu);
        f.setMenuBar(menu_bar);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
public class menu_gui {
    public static void main(String[]args){
        new menu();
    }
}
