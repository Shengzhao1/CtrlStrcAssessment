import java.util.Scanner;

/*
 * Assignment 2 
a. Create a class ForLoopTest with main() method 
b. Declare and initialize an integer variable to any value 
c. Find and print the factorial of the variable using for loop
x.assume all input are integer
 */
public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		System.out.println("give me your input for factorial");
		Scanner input = new Scanner(System.in);
		int intger =input.nextInt();
		for(int i=1;i<intger+1;i++) {
			a = a*i;
			System.out.println(a);
		}
		System.out.println("the factorial value of "+intger+" is "+a);
		
	}

}
