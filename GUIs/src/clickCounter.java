/******************************************************************************
 *  Compilation:  javac GUI.java
 *  Execution:    java GUI
 *
 *  A minimal Java program with a graphical user interface. The
 *  GUI prints out the number of times the user clicks a button.
 *  Also limits the number of clicks by the user
 * 
 *  % java GUI
 *
 ******************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class clickCounter implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    public JLabel label2 = new JLabel("Max Clicks: 30");
    private JFrame frame = new JFrame();

    public clickCounter() {

        // the clickable button
        JButton button = new JButton("Click Here");
        button.addActionListener(this);
        button.setBorderPainted(true);
        button.setFont(new Font("Segeo UI", Font.PLAIN, 26));
        button.setBackground(Color.lightGray);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 80, 50, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.setBackground(Color.white);
        panel.add(button);
        panel.add(label);
        panel.add(label2);
        

        // set up the frame and display it
        frame.add(panel, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicks Counter");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        if(clicks<30){
            clicks++;
            label.setText("Number of clicks:  " + clicks);
        }if(clicks==20){
            clicks++;
            label2.setText("Limit close");
            label2.setFont(new Font("Arial Black", Font.PLAIN, 12));
            label2.setForeground(Color.ORANGE);
            label.setText("Number of clicks:  " + clicks);
        }else if(clicks>=30){
            label2.setText("Max clicks reached");
            label2.setFont(new Font("Arial Black", Font.PLAIN, 12));
            label2.setForeground(Color.RED);
        }
    }
    // create one Frame
    public static void main(String[] args) {
        new clickCounter();
    }
}