import java.util.Scanner;
public class Reverse {

	
	public static void reverseWord(String word) {
		char[] arr = word.toCharArray();
		int i=arr.length - 1; //subtract '1' because index starts at 0
		while( i>=0) {
		System.out.print(arr[i]); 
		i--;
		}
	}
	
				public static void main(String[] args) {
					Scanner sc = new  Scanner(System.in);
					System.out.println("Enter the Word/Phrase: ");
					String word = sc.nextLine();
					
					Reverse r1 = new Reverse(); //creating an object
					r1.reverseWord(word);
					sc.close();
				}
}
