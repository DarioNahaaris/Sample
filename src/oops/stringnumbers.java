//Q:13

package oops;
import java.util.Scanner;
public class stringnumbers {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter a string:");
		        String word = scanner.nextLine();
		        
		        int stringnumber = countCharacters(word);
		        
		        System.out.println("Total number of characters: " + stringnumber);
		        
		        
		    }
		    
		    public static int countCharacters(String str) {
		       
		        return str.length();
		    }
		}
	
