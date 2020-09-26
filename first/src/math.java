import java.util.Random;
import static java.lang.Thread.sleep;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class math implements ActionListener{
		
	static JFrame f=new JFrame("Math Mania");
	JPanel p=new JPanel();
	JLabel head=new JLabel("Math Mania");
	JLabel l1=new JLabel(question + " = ?");
	JTextField tf = new JTextField("",4);
	JButton button=new JButton("Submit");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	JLabel l3=new JLabel("Correct Answers: 0");
	static JLabel l2=new JLabel(" ❤️ ❤️ ❤️");
	JLabel liv=new JLabel("Lives: ");
	JLabel l4=new JLabel("(Status)");
    static JLabel Time=new JLabel(" Time: ");
	
		
	static String question = "";
	static String lives = " ❤️ ❤️ ❤️"; //
	static int answer = 0;
	static int Answer = 0;
	static int i = 0;
	static int timer=10;
	static boolean running=true;
	
	
public math() {
	p.setLayout(null); p.setBackground(Color.white);
	p.add(head);
	head.setBounds(150,40,260,40); head.setFont(new Font("Chilanka",Font.PLAIN,35));
	p.add(l1);
	l1.setBounds(170,130,220,40); l1.setFont(new Font("Chilanka",Font.PLAIN,35)); l1.setForeground(Color.ORANGE);
	p.add(tf); 
	tf.setBounds(125,200,120,35); tf.setFont(new Font("Segeo UI",Font.PLAIN,24)); tf.setBackground(Color.LIGHT_GRAY);
	p.add(button);
	button.setBounds(250,205,100,25); button.setBackground(Color.white); button.addActionListener(this);
	p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b0);
	b1.setBounds(140,270,45,25); b1.setBackground(Color.white); b1.setFont(new Font("Segeo UI",Font.PLAIN,18));b1.addActionListener(this);
	b2.setBounds(220,270,45,25); b2.setBackground(Color.white); b2.setFont(new Font("Segeo UI",Font.PLAIN,18));b2.addActionListener(this);
	b3.setBounds(300,270,45,25); b3.setBackground(Color.white); b3.setFont(new Font("Segeo UI",Font.PLAIN,18));b3.addActionListener(this);
	b4.setBounds(140,310,45,25); b4.setBackground(Color.white); b4.setFont(new Font("Segeo UI",Font.PLAIN,18));b4.addActionListener(this);
	b5.setBounds(220,310,45,25); b5.setBackground(Color.white); b5.setFont(new Font("Segeo UI",Font.PLAIN,18));b5.addActionListener(this);
	b6.setBounds(300,310,45,25); b6.setBackground(Color.white); b6.setFont(new Font("Segeo UI",Font.PLAIN,18));b6.addActionListener(this);
	b7.setBounds(140,350,45,25); b7.setBackground(Color.white); b7.setFont(new Font("Segeo UI",Font.PLAIN,18));b7.addActionListener(this);
	b8.setBounds(220,350,45,25); b8.setBackground(Color.white); b8.setFont(new Font("Segeo UI",Font.PLAIN,18));b8.addActionListener(this);
	b9.setBounds(300,350,45,25); b9.setBackground(Color.white); b9.setFont(new Font("Segeo UI",Font.PLAIN,18));b9.addActionListener(this);
	b0.setBounds(220,390,45,25); b0.setBackground(Color.white); b0.setFont(new Font("Segeo UI",Font.PLAIN,18));b0.addActionListener(this);
	p.add(liv);
	liv.setBounds(40,440,200,40); liv.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
	p.add(l2);
	l2.setBounds(100,440,200,40); l2.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20)); l2.setForeground(Color.red);
	p.add(l3);
	l3.setBounds(40,470,250,40); l3.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
	p.add(l4);
	l4.setBounds(260,430,200,60);l4.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
	p.add(Time);
	Time.setBounds(25,100,70,20); Time.setForeground(Color.GRAY); Time.setBorder(BorderFactory.createLineBorder(Color.black));	
	f.add(p);
	f.setSize(500,550);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	
}
	
	
	public static String addQuestion() {
		Random num1 = new Random();
		Random num2 = new Random();
		int x = num1.nextInt(99);
		int y = num2.nextInt(99);
		String question = x + " + " + y;
		Answer = x+y;
		return question;
	}
	
	
	
	
	
	
	
	public static String subQuestion() {
		Random num1, num2;
		num1 = new Random();
		num2 = new Random();
		int x = num1.nextInt(99);
		int y = num2.nextInt(99);
		if(x > y) {
			 String question =x + " - " + y;
			 Answer = x - y;
			 return question;
		} else {
			 String question =y + " - " + x;
			 Answer = y - x;
			 return question;
		}
	}
	
	
	
	
	
	
	
	public static String mulQuestion() {
		Random num1, num2;
		num1 = new Random();
		num2 = new Random();
		int x = num1.nextInt(20);
		int y = num2.nextInt(30);
		String question = x + " * " + y;
		 Answer = x * y;
		 return question;
	}
	
	
	
	
	
	public static String divQuestion() {
		Random num1, num2;
		num1 = new Random();
		num2 = new Random();
		int x = num1.nextInt(500);
		int y = num2.nextInt(500);
		if(x>y && y!=0) {
			if (y%x==0) {
			   String question = x + " / " + y;
			    Answer = x / y;
			    return question;
			}else {
				return divQuestion();
			}
		}else if (y>x && x!=0) {
			if(y%x==0) {
			    String question = y + " / " + x;
				 Answer = y / x;
				 return question;
			}else {
				return divQuestion();
			}
		}else {
			  return divQuestion();
		}
	}
		
	
			public static void main(String[] args) {
				
				Random rand = new Random();
				int n = rand.nextInt(4);
				
				if(n==0) {
				  question = addQuestion();
				  answer = Answer;
				}
				
				if(n==1) {
				   question = subQuestion();
				   answer = Answer;
				}
				
				if(n==2) {
					question = mulQuestion();
					 answer = Answer;
				}
				
				if(n==3) {
					question = divQuestion();
					answer = Answer;
				}
				
				new math();
				
				while(running) {
					try {
						sleep(1000); //1 second delay
						Time.setText(" Time: " + timer);
						timer--;
						if(timer==-1) {
						lives=lives.substring(0, lives.length()-3);  //String function to remove the last 3 characters of 'lives' (heart)
						l2.setText(lives);											//starting from beginning (index at 0)
						timer=10;
						if(lives.length()==0) {										//if lives are left 0
							int dialog=JOptionPane.showConfirmDialog(null, "GAME OVER! Retry?", "Game Over", JOptionPane.YES_NO_OPTION);
							if(dialog == JOptionPane.NO_OPTION){
							f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING)); //closes current JFrame
						  }else {
							  f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
							  lives = " ❤️ ❤️ ❤️";
							  new math();
						  }
						}
						
						}
					}catch(Exception ecx) {
						//NO EXCEPTION
					 }
				}
  }
			

			
			
			
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					tf.setText(tf.getText().concat("1"));
				}
				if(e.getSource()==b2) {
					tf.setText(tf.getText().concat("2"));
				}
				if(e.getSource()==b3) {
					tf.setText(tf.getText().concat("3"));
				}
				if(e.getSource()==b4) {
					tf.setText(tf.getText().concat("4"));
				}
				if(e.getSource()==b5) {
					tf.setText(tf.getText().concat("5"));
				}
				if(e.getSource()==b6) {
					tf.setText(tf.getText().concat("6"));
				}
				if(e.getSource()==b7) {
					tf.setText(tf.getText().concat("7"));
				}
				if(e.getSource()==b8) {
					tf.setText(tf.getText().concat("8"));
				}
				if(e.getSource()==b9) {
					tf.setText(tf.getText().concat("9"));
				}
				if(e.getSource()==b0) {
					tf.setText(tf.getText().concat("0"));
				}
				if(e.getSource()==button) {
					
					try {
					if(Integer.parseInt(tf.getText())==answer) {
						
						Random rand = new Random();
						int n = rand.nextInt(4);
						
						if(n==0) {
						  question = addQuestion();
						  answer = Answer;
						}
						
						if(n==1) {
						   question = subQuestion();
						   answer = Answer;
						}
						
						if(n==2) {
							question = mulQuestion();
							 answer = Answer;
						}
						
						if(n==3) {
							question = divQuestion();
							answer = Answer;
						}
							
						l4.setText("(Correct Answer)");
						l4.setForeground(Color.green);
						tf.setText("");
						i++;
						l3.setText("Correct Answers: " + Integer.toString(i));
						
						l1.setText(question + " = ?");
						timer=10;
						
					}else {
						l4.setText("(Wrong Answer)");
						l4.setForeground(Color.red);
						tf.setText("");
						
					}
					}catch(java.lang.NumberFormatException ex) {
						l4.setText("(Field Blank)");
						l4.setForeground(Color.red);
					}
				}
			
	
			
			
			}
			
				
			
			
}

