import java.util.Scanner;
public class mainClass {
    
    public static void enter(String argOne){
        System.out.println(argOne);
    }
    
    public static int num(int numOne , int numTwo){
       numOne=69;
       numTwo=1;
       int answer = numOne * numTwo;
        return answer;
    }
    
            public static void main(String[] args){
               enter("Enter first number: ");
                      Scanner first = new Scanner(System.in); 
                    int firstNum = first.nextInt();  
               enter("Enter second number: ");      
                      Scanner second = new Scanner(System.in);   
                    int secondNum = second.nextInt();
                    
                    int solution = firstNum * secondNum;
                    enter("The answer is " + solution);
                      
            }
}
