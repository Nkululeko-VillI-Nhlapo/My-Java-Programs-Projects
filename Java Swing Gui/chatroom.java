// making a sipmle chatroom using swing and awt

import javax.swing.*;
import java.awt.*;

public class chatroom {

    public static void main(String [] args){
        JFrame container = new JFrame("ChatRoom");
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(600,400 );

        JMenuBar menu = new JMenuBar();
        JMenu menuitem_1 = new JMenu("File");
        JMenu menuitem_2 = new JMenu("Help");
        menu.add(menuitem_1);
        menu.add(menuitem_2);

        JMenuItem nav_item =  new JMenuItem("Open");
        JMenuItem nav_item_2 =  new JMenuItem("Save As");
        menuitem_1.add(nav_item);
        menuitem_1.add(nav_item_2);


        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Text");

        JTextField textf = new JTextField(20);

        JButton send = new JButton("Send");

        JButton reset =  new JButton("Reset");

        panel.add(label);
        panel.add(textf);
        
        panel.add(send);
        panel.add(reset);

        JTextArea texta = new JTextArea();

        container.getContentPane().add(BorderLayout.SOUTH, panel);
        container.getContentPane().add(BorderLayout.NORTH, menu);
        container.getContentPane().add(BorderLayout.CENTER, texta);

        container.setVisible(true);




        
        

        
    
    }
}
