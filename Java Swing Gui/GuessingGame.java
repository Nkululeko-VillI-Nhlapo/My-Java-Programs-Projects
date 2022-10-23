/*Nhlapo Nkululeko Villicent
 * - JAVA SWING GUI game, that allows the user to guess a number, until they a guess a correct one
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

class GuessingGame implements ActionListener{

    private int randomNum;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JTextField textField;

    public GuessingGame(){
        Random random = new Random();// a new random object which will allow us to generate random numbers
        randomNum = random.nextInt(10,95);

//Builidng of the GUI, using J FRAMES, PANELS, LABELS, BUTTONS, TEXTFIELD
        frame = new JFrame("Guessing Game");

        label = new JLabel("Let`s play");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        textField = new JTextField(5);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Submit");
        button.addActionListener(this);
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 150, 200));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.add(panel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override  //Overrideing the buttons so that it's clikable and able to respond
    public void actionPerformed(ActionEvent e) {
        int input = Integer.parseInt(textField.getText()); //converting the text from the textfield to integers
        if(input == randomNum){
            label.setText("Correct!");   // conditions, which will determine whether the user has guessed 
        }
        else if(input < randomNum){
            label.setText("Too low");   // correctly or not
        }
        else{
            label.setText("Too high");
        }
    }


    public static void main(String args[]) {

        GuessingGame gui = new GuessingGame(); //calling on the method, which runs the program.
    }

}