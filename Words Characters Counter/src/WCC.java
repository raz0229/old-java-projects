import java.awt.*;
import javax.swing.*;
public class WCC {
 
	        public static void main() {
	        	String text="Hi! My name is RAZ";  
	        	int clength=text.length();//returns total number of characters with space
	        	String words[]=text.split("\\s");  
	        	int length=words.length;//returns total number of words  
	        	System.out.println(length);
	        	System.out.println(clength);
               }

	        public static void main(String[] args) {
	        	main();
	        }
	       
}
