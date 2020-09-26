
import java.util.Scanner;

public class funGame {
       public static String text(String text){
        System.out.println(text);
       return text;
    }

       
    public static void main(String[] args) {
        
        boolean running =true;
        GAME:             //just a label
        while(running){
     
                      text("Enter the sum of any three progressive numbers: ");
                      Scanner sc = new Scanner(System.in);
                      int sum = sc.nextInt();
                      
                      int num1, num2, num3;
                      num2 = sum/3; num1 = num2 -1; num3 = num2 + 1;
                      
                      text("The numbers you thought were: ");
                      text("\n " + num1);
                      text("\n " + num2);
                      text("\n " + num3);
                      
                      continue GAME;  //loops back to where label is
                      //if not added GAME: (specific label name), loops back automatically into current label
        } 
                     
                      
    }
    
}
