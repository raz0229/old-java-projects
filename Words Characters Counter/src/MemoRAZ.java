import javax.swing.*;  
import java.io.FileWriter;
import java.awt.*;  
import java.awt.event.*;  
public class MemoRAZ extends JFrame implements ActionListener{  
JFrame f;  JLabel l=new JLabel("MemoRAZ");
JButton b,b1,b2,b3; JPanel p = new JPanel();
JTextArea ta;  
MemoRAZ(){ 
    f=new JFrame("MemoRAZ v1.0");
    
    l.setIcon(new ImageIcon("D:\\memorazicon.png"));
    l.setBounds(130,-60,250,200); l.setFont(new Font("Century Gothic",Font.PLAIN,34));
    b=new JButton("Pad Color"); b.setBackground(Color.WHITE);
    b.setBounds(338-3,400,100,30); b.setFont(new Font("Segeo UI",Font.PLAIN,12));
    b1=new JButton("Text Color");b1.setBackground(Color.white);
    b1.setBounds(240-3,400,100,30); b1.setFont(new Font("Segeo UI",Font.PLAIN,12));
    b2=new JButton("Counter"); b2.setBackground(Color.WHITE);
    b2.setBounds(150-3,400,100,30); b2.setFont(new Font("Segeo UI",Font.PLAIN,12)); 
    b3=new JButton("Save (.txt)"); b3.setBackground(Color.WHITE);
    b3.setBounds(51-3,400,100,30); b3.setFont(new Font("Segeo UI",Font.PLAIN,12));
    ta=new JTextArea();  ta.setFont(new Font("Kristen ITC",Font.PLAIN,16));
    ta.setBounds(40,90,400,300); ta.setBackground(new Color(255,247,132));
    ta.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
    b.addActionListener(this); b1.addActionListener(this);
    b2.addActionListener(this); b3.addActionListener(this);
    
    p.setLayout(null);
    p.setBackground(Color.WHITE);
    p.add(l);
    p.add(b);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(ta);
    
    f.add(p); 
    f.setSize(500,500);  
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
	if(e.getSource()==b) {
    Color c=JColorChooser.showDialog(this,"Choose",Color.BLACK);  
    ta.setBackground(c);  
	}if(e.getSource()==b1) {
	 Color c=JColorChooser.showDialog(this,"Choose",Color.BLACK);
	 ta.setForeground(c);
	}if(e.getSource()==b2) {
	 String text = ta.getText(); int cLength = text.length();
	 String words[]=text.split("\\s"); int length = words.length;
	 JOptionPane.showMessageDialog(this,"No. of characters: "+cLength + "\nNo. of words: "+length);
	}if(e.getSource()==b3) {
		try {
			double rand = Math.random() * 1000;
			int random = (int) rand;
			String users = System.getenv("USERPROFILE");
			FileWriter fw = new FileWriter(users+"/desktop/memo"+random+".txt");
			fw.write(ta.getText());
			fw.close();
			JOptionPane.showMessageDialog(this,"SUCCESS: \"memo" +random+".txt\'"+" saved to Desktop");
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(this,"Something went wrong");
			ex.printStackTrace();
		}
	}
}  
public static void main(String[] args) {  
    new MemoRAZ();  
}  
}     