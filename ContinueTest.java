/*
 * 6. Assignment 6 
a. Create a class ContinueTest with main() method 
b. Create a loop to iterate from 1 to 100 
c. Print only the even numbers 
 */
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int t = 0; t<101; t++) {
			if(t%2==0) {
				System.out.println(t);
			}else {continue;}
		}
	}

}
