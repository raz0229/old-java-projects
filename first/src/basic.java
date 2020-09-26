import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class basic implements ActionListener {
	JFrame f=new JFrame("Seconds to Readable");
	JPanel p=new JPanel();
	JTextField tf = new JTextField("",10);
	JButton b=new JButton("Convert");
	JLabel l=new JLabel("Seconds");
	JLabel l2=new JLabel("<html> 0 Years, 0 Days, 0 Hours, <br> 0 Minutes, 0 Seconds</html>");
	
	public basic(){
		p.setLayout(null); p.setBackground(new Color(255,255,255));
		p.add(tf);
		tf.setBounds(125,60,120,30); tf.setFont(new Font("Segeo UI",Font.PLAIN,18)); tf.setBackground(Color.LIGHT_GRAY);
		p.add(l);
		l.setBounds(265,60,120,30); l.setFont(new Font("Segeo UI",Font.PLAIN,18));
		p.add(b); b.addActionListener(this);
		b.setBounds(170,100,120,30); b.setBackground(new Color(255,255,255));
		p.add(l2);
		l2.setBounds(70,150,330,50); l2.setFont(new Font("Segeo UI",Font.PLAIN,16));
		l2.setBorder(BorderFactory.createLineBorder((Color.BLACK)));
		f.add(p);
		f.setSize(470,250);
		f.setVisible(true);
		
				
				
	}
	
					public static void main(String[] args) {
						new basic();
						
						
					}
					
					public static String second(long sec) {
						 String answer = sec + " Seconds";
						 return answer;
					}
					
		public static String min(long sec) {
			if(sec<=60) {
				String answer = sec/60 + " Minutes, ";
				return answer.concat(second(sec%60));
			}else {
				String answer = sec/60 + " Minutes, ";
				return answer.concat(second(sec%60));
			}
		}
		
		public static String hour(long sec) {
			if(sec<=3600) {
				String answer = sec/3600 + " Hours, ";
				return answer.concat(min(sec%3600));
			}else{
				String answer = sec/3600 + " Hours, ";
				return answer.concat(min(sec%3600));
			}
		}
		
		public static String day(long sec) {
			if(sec<=86400) {
				String answer = sec/86400 + " Days, ";
				return answer.concat(hour(sec%86400));
			}else{
				String answer = sec/86400 + " Days, ";
				return answer.concat(hour(sec%86400));
			}
		}
		
		public static String year(long sec) {
			if(sec<=31536000) {
				String answer = sec/31536000 + " Years, ";
				return answer.concat(day(sec%31536000));
			}else{
				String answer = sec/31536000 + " Years, ";
				return answer.concat(day(sec%31536000));
			}
		}
		
		public void actionPerformed(ActionEvent e) {
			try {
				long in = Long.parseLong(tf.getText());
				
				if(in<60) {
				   l2.setText(second(in)); 
				   l2.setForeground(Color.BLUE);
				}
				if(in>=60 && in<3600) {
				  l2.setText(min(in));
				  l2.setForeground(Color.BLUE);
				}
				if(in>=3600 && in<86400) {
				  l2.setText(hour(in));
				  l2.setForeground(Color.BLUE);
				}
				if(in>=86400 && in<31536000) {
				 String label = "<html>"+day(in)+"</html>";
				  l2.setText(label);
				  l2.setForeground(Color.BLUE);
				}
				if(in>=31536000) {
				  String label = "<html>"+year(in)+"</html>";
				  l2.setText(label);
				  l2.setForeground(Color.BLUE);
				}
				}catch(java.lang.NumberFormatException ex) {
						l2.setText("ERROR: OUT OF RANGE");
						l2.setForeground(Color.RED);
					}
		}

}
