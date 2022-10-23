/*Name: Nhlapo Nkululeko Villicent
 *StudeNum: 4129962
 *Project 2 - Gui Math Application
 */
import javax.swing.*;
import javax.swing.border.Border;

import org.w3c.dom.events.Event;

import java.awt.Color;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.random.*;


class mathGui_4129962  implements ActionListener {

    private int arbitrary_1, arbitrary_2, userInput, sum;
    private int tally = 0;
    private int count = 0 ;
   

    private JFrame structure;
    private JLabel name, name_2, name_3, name_4, space, space_1, name_5 ;
    private JPanel board, rboard;
    private JTextField tf;
    private JButton toggler, toggler_2;

    public  mathGui_4129962(){
        Random random = new Random();
      


        arbitrary_1 = random.nextInt(1000, 20000);
        arbitrary_2 = random.nextInt(1000, 20000);

        structure = new JFrame("Math GUI");
        structure.setSize(600,400);
        
        

        name = new JLabel("Correct: " + tally + " Wrong: "+ count );
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setSize(90, 40);

        

        name_2 = new JLabel(arbitrary_1 + " + " + arbitrary_2 + " = ");
        name_2.setHorizontalAlignment(SwingConstants.CENTER);

        tf = new JTextField(5);
        tf.setHorizontalAlignment(SwingConstants.CENTER);

        rboard = new JPanel();
        
        rboard.add(name_2);
        rboard.add(tf);

        name_3 = new JLabel("");

        toggler = new JButton("Submit");
        toggler.addActionListener(this);

        board = new JPanel();
        
        
        board.setBackground(Color.lightGray);
        board.setBorder(BorderFactory.createEmptyBorder(60,230 , 90, 230));
        board.setLayout(new GridLayout(0,1));
        board.add(name);
        board.add(rboard);
        board.add(name_3);
        board.add(toggler);
        

        
        structure.add(board, BorderLayout.NORTH);
        structure.getContentPane().setBackground(Color.lightGray);
        structure.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        structure.pack();
        structure.setVisible(true);

     }

     @Override
     public void actionPerformed(ActionEvent e){
        Random random = new Random();
         userInput = Integer.parseInt(tf.getText());
         sum = arbitrary_1 + arbitrary_2;
        if ( userInput == sum ){
            tally += 1;
            
        }
        else if (userInput != sum){
            count += 1;   
        }

        name.setText("Correct: " +tally + " Wrong: "  + count);
        name.setHorizontalAlignment(SwingConstants.CENTER);

        arbitrary_1 = random.nextInt(1000, 20000);
        arbitrary_2 = random.nextInt(1000, 20000);

        name_2.setText(arbitrary_1 + " + " + arbitrary_2 + " = ");
        name_2.setHorizontalAlignment(SwingConstants.CENTER); 
        userInput = Integer.parseInt(tf.getText());

        tf.setText("");

        if (count ==3){
            board.remove(toggler);
            board.remove(name);
            board.remove(rboard);
            board.add(name_3);


            name_4 = new JLabel("You LOST!!!!!!");
            name_4.setHorizontalAlignment(SwingConstants.CENTER);

            space = new JLabel("");
            name_5 = new JLabel("Score: " + count + " - " + tally);
            name_5.setHorizontalAlignment(SwingConstants.CENTER);
            
            space_1 = new JLabel("");
            toggler_2 = new JButton("Play Again");

            board.add(name_4);
            board.add(space);
            board.add(name_5);
            board.add(space_1);
            board.add(toggler_2);
            toggler_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new mathGui_4129962();
                }
            });
            

            
            
               
        }

        else if (tally == 3){
            board.remove(toggler);
            board.remove(name);
            board.remove(rboard);
            board.add(name_3);


            name_4 = new JLabel("You WIN !!!!!!");
            name_4.setHorizontalAlignment(SwingConstants.CENTER);

            space = new JLabel("");
            name_5 = new JLabel("Score: " +tally + " - " + count );
            name_5.setHorizontalAlignment(SwingConstants.CENTER);
            
            space_1 = new JLabel("");
            toggler_2 = new JButton("Play Again");

            board.add(name_4);
            board.add(space);
            board.add(name_5);
            board.add(space_1);
            board.add(toggler_2);
            toggler_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new mathGui_4129962();
                }
            });
               
        }



     }

     
    public static void main(String [] args){
         new mathGui_4129962();
    }
}