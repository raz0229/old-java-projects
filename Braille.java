import java.util.Arrays;
import java.util.Scanner;
public class Braille {

	static int i, j;
	
	static char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' ,'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	static String[] characters = {"100000", "110000", "100100", "100110", "100010", "110100", "110110", "110010", 
			"010100", "010110", "101000", "111000", "101100", "101110", "101010", "111100", "111110", "111010", 
			"011100", "011110", "101001", "111001", "010111", "101101", "101111", "101011"};
	
	static StringBuilder bld = new StringBuilder();
	
	
				public static void main(String[] args) {
					
					try {
					System.out.println("Enter Plain Text:");
					Scanner sc = new Scanner(System.in);
					char[] test = sc.next().toCharArray();
					
							for (i = 0; i <= test.length-1; i++ ) {
							bld.append(solution(test[i]));
							}
							
							System.out.println(bld);
							sc.close();
					}
					catch(java.lang.ArrayIndexOutOfBoundsException e) {
						System.out.println("Numbers and Special Characters Not Allowed");
					}
				}
				
				
				public static String solution(char c) {
					
					j = Arrays.binarySearch(alphabets, c);
					
					return characters[j];
				}
}
