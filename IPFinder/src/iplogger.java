import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;

public class iplogger extends JFrame implements ActionListener{

	static JFrame f;
	static JPanel p;
	static JButton b;
    static JLabel l;
    static JTextField tf;
    
public iplogger() {
    f=new JFrame("IPv4 Finder"); //JFrame
    p=new JPanel(); //JPanel
    b=new JButton("Submit"); //JButton
    b.setForeground(Color.ORANGE);
    b.setBackground(Color.white);
    b.addActionListener(this);
    l=new JLabel("Enter the URL here:      "); //JLabel
    tf=new JTextField(); //JTextField
    
  
    p.setLayout(new GridLayout(0, 1));
   p.setBorder(BorderFactory.createEmptyBorder(30, 100, 50, 80));
   p.setBackground(Color.WHITE);
    p.add(l);
    p.add(tf);
    p.add(b);
    f.add(p);
    f.pack();
    f.add(p, BorderLayout.CENTER);
    f.show();
}
    
    
   public void actionPerformed(ActionEvent e) {
	   String url = tf.getText();
	   try {
		   InetAddress ia=InetAddress.getByName(url);  
	       String ip=ia.getHostAddress() + " (" + ia.getHostName() + ")";
	       JOptionPane.showMessageDialog(this,ip);
	   }
		catch(Exception whatever) {   
			JOptionPane.showMessageDialog(this, "Wrong URL entered");
	   }
	   
   }
	
	        public static void main(String[] args) {
                          new iplogger();
	        
	        }
}
