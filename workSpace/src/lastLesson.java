//demonstration of java calculator
import java.util.Scanner;
public class lastLesson {
    
    public static void fixVal(){
           
          }
    
     private static void chooseMet(){
          System.out.println("1) Add");
          System.out.println("2) Subtract");
          System.out.println("3) Multiply");
          System.out.println("4) Divide");
          System.out.print("Choose Method: ");
     }
                                                    public static float add(float x, float y){
                                                       return x + y;
                                                     }
                                                    public static float sub(float x, float y){
                                                       return x - y;
                                                     }
                                                    public static float mul(float x, float y){
                                                       return x * y;
                                                     }
                                                    public static float div(float x, float y){
                                                       return x / y;
                                                     }
    
    
    
                               public static void main(String[] args) {
                                   
                                             System.out.print("Enter 1st float value: ");
                                               Scanner num1 = new Scanner(System.in);
                                                  float nOne = num1.nextFloat();
                                             System.out.print("Enter 2nd float value: ");
                                               Scanner num2 = new Scanner(System.in);
                                                  float nTwo = num2.nextFloat();
                                                  
                                             chooseMet(); //asks the user about the calculation method
                                             
                                           Scanner met = new Scanner(System.in);
                                           int method = met.nextInt();
                                           float sol;
                                           
                                       switch(method) {
                                           case 1: 
                                                   sol =  add(nOne , nTwo);
                                                   System.out.println("Your answer is " + sol);
                                               break;
                                            
                                           case 2:
                                                   sol =  sub(nOne, nTwo);
                                                   System.out.println("Your answer is " + sol);
                                               break;
                                               
                                           case 3:
                                                    sol = mul(nOne, nTwo);
                                                    System.out.println("Your answer is " + sol);
                                               break;
                                               
                                           case 4:
                                                    sol = div(nOne, nTwo);
                                                    System.out.println("Your answer is " + sol);
                                               break;
                                               
                                           default:
                                                    System.out.println("Wrong choice of operand!");
                                               break;
                                  
                                       }
                                             
                               }
}
