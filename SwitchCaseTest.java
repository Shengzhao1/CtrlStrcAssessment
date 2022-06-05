import java.util.Scanner;

/*
 * 1.  Assignment 1 
     a. Create a class SwitchCaseTest with main() method 
     b. Declare and initialize a character variable with any alphabet 
     c. Find if the character is a vowel and print the result
     x. assume all input are character
 */
public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input, this will check first input char ");
		Scanner input = new Scanner(System.in);
		char chr =input.next().charAt(0);
		switch(chr) {
		case 'a': {System.out.println("this is a voewl");break;}
		case 'e': {System.out.println("this is a voewl");break;}
		case 'i': {System.out.println("this is a voewl");break;}
		case 'o': {System.out.println("this is a voewl");break;}
		case 'u': {System.out.println("this is a voewl");break;}
		default : {System.out.println("this is not a voewl");break;}

		}
	}

}
