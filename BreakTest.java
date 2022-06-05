/*
 * 5. Assignment 5 
a. Create a class BreakTest with main() method 
b. Find and print all prime numbers between 1 and 100 
 */
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<101;i++) {
			int count = 0;
			for(int j =2;j<i;j++) {
				if(i%j==0) {
					count ++;
					break;
					
				}
				
			}
			if(count == 0) {System.out.println(i);}

		}
	}

}
