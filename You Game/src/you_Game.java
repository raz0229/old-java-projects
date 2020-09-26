import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  you_Game implements ActionListener {
	static JFrame f;
	static JPanel p;
	static JButton b;
	
public you_Game(){
	try { 
		// set look and feel 
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
	} 
	catch (Exception e) { 
		System.err.println(e.getMessage()); 
	} 
	
	f= new JFrame("Hello");
   f.setDefaultLookAndFeelDecorated(true);
    
    p =  new JPanel();
    p.setBackground(Color.WHITE);
    p.setLayout(new GridBagLayout());
    
    //layout manager
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 2;
    gbc.gridy = 2;

	b = new JButton("Say Hello");
	b.setIcon(new ImageIcon("C:/Users/Rajpoot Abdullah/workspace/You Game/src/play.png"));
	b.addActionListener(this);
	
	p.add(b,gbc); //Button 1
	
	gbc.gridx = 0;
	gbc.gridy = 0;
	p.add(new JButton("Experimental"),gbc);
	
	f.add(p);
	f.setVisible(true);
	f.setSize(300,300);
	
}

public static void start() {
	new you_Game();
}

		//Action Listener
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello");
		}
	
						public static void main(String[] args) {
							start();
						}

}
