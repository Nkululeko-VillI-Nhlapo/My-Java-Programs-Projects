import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

//Gonna make a GUI frame and add a button
public class gui_practice1 {
    public static void main(String [] args){
        JFrame frame = new JFrame("My frame Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 300);
        JButton button = new JButton("Press");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        
        frame.setVisible(true);
    }
}
