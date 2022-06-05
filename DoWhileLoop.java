import java.util.Scanner;

/*
 * Assignment 4 
a. Create a class DoWhileLoop with main() method 
b. Print the first 10 numbers of the Fibonacci series using do while loop
 */
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		
		int input = 10;
		int adder = 0;
		int adder2 = 1;
		int result = 0;			
		System.out.println("0");

		do{	
			result = adder + adder2;
			System.out.println(result);
			adder2 = adder;
			adder = result;
			counter ++;
		}while(input != counter);
	}

}
