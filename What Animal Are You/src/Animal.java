import java.awt.*;
import javax.swing.*;

public class Animal {
	static JFrame f = new JFrame("What Animal are You?");
	static JLayeredPane p = new JLayeredPane();
	static JButton b;
	static JLabel l, bgLabel,menuHeader;
	static ImageIcon img, spiritAnimal;
	
	public static void menu() {
		b=new JButton("START");
		l=new JLabel("What Animal Are You?");
		img = new ImageIcon("/home/raz0229/Pictures/jungle background clipart.jpg");
		spiritAnimal = new ImageIcon("/home/raz0229/Pictures/spiritAnimal.PNG");
		
		bgLabel = new JLabel();
		bgLabel.setIcon(img);
		bgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		menuHeader = new JLabel();
		menuHeader.setIcon(spiritAnimal);
		menuHeader.setBounds(255,290,spiritAnimal.getIconWidth(),spiritAnimal.getIconHeight());
		
		p.add(bgLabel,1,0); //places image behind
		p.add(b,2,0); //places button on top
		p.add(menuHeader,1,0);
		b.setBounds(380,460,200,50);
		b.setBackground(new Color(117,190,0)); b.setForeground(Color.WHITE);
		b.setFont(new Font("RockWell Extra Bold",Font.PLAIN,40));
		p.setLayout(null);
		p.setBackground(Color.WHITE);
		
		f.add(p);
		f.setSize(img.getIconWidth(),img.getIconHeight()); //sets size of frame to the dimension of icon
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
						public static void main(String[] args) {
						 menu();
						}

}
