import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;    
class jRadioButton extends JFrame implements ActionListener{    
JRadioButton rb1,rb2;    
JButton b;    
String[] opt = {"Male","Female"};
jRadioButton(){      
rb1=new JRadioButton(opt[0]);    
rb1.setFont(new Font("Segeo UI",Font.PLAIN,26));
rb1.setIcon(new ImageIcon("C:/Users/Rajpoot Abdullah/Pictures/redDot.png"));
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton(opt[1]);    
rb2.setBounds(100,100,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
add(rb1);add(rb2);add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}    
public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Male.");    
}    
if(rb2.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Female.");    
}    
}    
public static void main(String args[]){    
new jRadioButton();    
}}   