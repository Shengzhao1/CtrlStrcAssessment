import java.util.Scanner;

/*
 * 3. Assignment 3 
a. Create a class WhileLoop with main() method 
b. Declare and initialize an integer variable to any value 
c. Find if the given value is a palindrome
 */
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input, this will check is a palindrome ");

		Scanner input = new Scanner(System.in);
		String value = input.next();
		int counter = 0;
		int check =0;
		while(counter<value.length()/2+1) {
			if(value.charAt(counter)== value.charAt(value.length()-counter-1)) {
				counter ++;
			}
			else {
				System.out.println("the input is not a palindorme");
				check ++;
				break;
			}
		}
		if(check ==0) {
			System.out.println("the input is  a palindorme");

		}
	}

}
