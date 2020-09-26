//exercise demonstrating working of loops in java
//a method is created for eachloop
//comment in the main method and run the program

public class loops {

    public static void whileLoop() {
        int a = 0;
        while (a >= 6) {
            System.out.println(a);
        }
        System.out.println("Loop finished");
    }

    public static void forLoop() {
        for(int a = 0; a < 6; a++) {
            System.out.println(a);
        }
        System.out.println("Loop finished");
    }

    public static void doWhileLoop() {
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 6);
        System.out.println("Loop finished");

    }

    public static void main(String[] args) {
        //whileLoop();
        //forLoop();
        doWhileLoop();
        
    }

}
