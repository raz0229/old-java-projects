import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class SwingDemo extends JFrame {
	
   Image img = Toolkit.getDefaultToolkit().getImage("C:/Users/Rajpoot Abdullah/Pictures/aliadam.jpg");
   public SwingDemo(){
      this.setContentPane(new JPanel(){
    	  
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
         
      });
      setSize(760,458);
      setVisible(true);
   }
   public static void main(String[] args) throws Exception {
      new SwingDemo();
   }
}