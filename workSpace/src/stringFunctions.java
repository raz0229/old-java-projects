
public class stringFunctions {
    
    public static void tryingFunctions(){
         String name= "My name is ";
                                 name=name.concat("RAZ");    //concat function adds to a string
                                 
                                 //                                    1   2
                                 name=name.replace('R','N');  //replace function replaces characters
                                 
                                System.out.println(name);
                                 
                                
    }
    
                             public static void main(String[] args) {
                                
                               //tryingFunctions();
                               String message = "Hello, World! ";
                               char[] chars = message.toCharArray();
                               System.out.println(chars[3]);
                               /*
                               Used to break string into characters and form array
                               Serves the same purpose as;
                               char[] chars = {'H','e','l'...};
                               */
                               Label: //Just a label
                               for(char whatver : chars){  //another method of performing for loop
                                  System.out.println(whatver);
                               }
                                 
                               
    }
    
}
