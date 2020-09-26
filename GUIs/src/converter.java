// Java program to convert
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.*; 
class converter extends JFrame implements ItemListener { 
    static JTextField t;
    static JFrame f;
    static JPanel p; 
    static JComboBox dropDown, dropDownTo;
    static JLabel l, l2, l3, l4;
	// main class 
	public static void main(String[] args) { 
                	l = new JLabel("Input:  "); 
                    l2 = new JLabel("From:  ");
                    l3 = new JLabel("To:  ");
                    l4 = new JLabel("Answer: 00.00 ");
                    f = new JFrame("Mass Converter"); 
                    t = new JTextField("Enter value here",14); 
                    p = new JPanel(); 
                
                                        converter s = new converter(); //create an object
                                        String choice1[] = {"Tonne", "Kilogram", "Gram", "Milligram", "Stone", "Pound", "Ounce"}; 
                                        String choice2[] = {"Tonne", "Kilogram", "Gram"," Milligram", "Stone", "Pond", "Ounce"}; 
                                        dropDown = new JComboBox(choice1);
                                        dropDownTo = new JComboBox(choice2);
                                        dropDown.addItemListener(s); 
                                        dropDownTo.addItemListener(s);

		// add buttons and textfield to panel 
		p.add(l); 
		p.add(t); 
		p.add(l2); 
        p.add(dropDown);
        p.add(l3);
        p.add(dropDownTo);
        p.add(l4);
        l4.setFont(new Font("Segoe UI Bold", Font.PLAIN, 14));
        l4.setForeground(Color.BLUE);
        l.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        l2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        l3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        p.setBackground(Color.WHITE);

		// add panel to frame 
		f.add(p); 
		f.setSize(373, 200); 
        f.show(); 
	} 

                    public void itemStateChanged(ItemEvent e){
                    	
                    	String text = t.getText();                                      //Converting
                        double ans = Double.parseDouble(text);                     // String to Float         
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                                
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = multiply(ans,1000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                              
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = multiply(ans,1000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                               
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Miligram"){
                            double  answer = multiply(ans,1000000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                              
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = multiply(ans,157);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                              
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = multiply(ans,2205);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Tonne"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = multiply(ans,35274);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,1000);    
                            String answe = Double.toString(answer);
                            l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Gram"){
                                   double  answer = multiply(ans,1000);    
                                   String answe = Double.toString(answer);
                                   l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe); 
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Miligram"){
                            double  answer = multiply(ans,1000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                              
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = divide(ans,6.35);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = multiply(ans,2.205);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Kilogram"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = multiply(ans,35.274);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,1000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = divide(ans,1000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                              
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Milligram"){
                            double  answer = multiply(ans,1000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = divide(ans,6350);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                         
                        }
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = divide(ans,454);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Gram"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = divide(ans,28.35);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,1000000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = divide(ans,1000000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = divide(ans,1000);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Milligram"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = divide(ans,(6.35*1000000000));
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = divide(ans,453592);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Milligram"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = divide(ans,28350);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,157);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = multiply(ans,6.35);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = multiply(ans,6350);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Milligram"){
                            double  answer = multiply(ans,(6.35*1000000));
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = multiply(ans,14);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Stone"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = multiply(ans,224);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                             
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,2205);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = divide(ans,2.205);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = multiply(ans,454);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                            
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Milligram"){
                            double  answer = multiply(ans,453592);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = divide(ans,14);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                          
                        }
                        
                        if(dropDown.getSelectedItem() == "Pound"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = multiply(ans,16);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                         
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Tonne"){
                            double  answer = divide(ans,35274);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                           
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Kilogram"){
                            double  answer = divide(ans,35.274);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                         
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Gram"){
                            double  answer = multiply(ans,28.35);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                        
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Milligram"){
                            double  answer = multiply(ans,28350);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                         
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Stone"){
                            double  answer = divide(ans,224);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                        
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Pound"){
                            double  answer = divide(ans,16);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                        
                        }
                        
                        if(dropDown.getSelectedItem() == "Ounce"  && dropDownTo.getSelectedItem() == "Ounce"){
                            double  answer = multiply(ans,1.00);
                            String answe = Double.toString(answer);
                           l4.setText("Answer in (" +dropDownTo.getSelectedItem()+")" + " is " + answe);                       
                        }
                    }


                   public static double multiply(double one, double two) {
                    	return one*two;
                   }
                    
                   public static double divide(double one, double two) {
                   	return one/two;
                  }
                   
} 
