//Subtracting of 2 numbers without using '-' operator//

package Tricky;
import java.util.Scanner;

public class TrickyProgram3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.print("The sum of 2 numbers is : "+Sub(a , b));
		sc.close();
	}
	public static int Sub(int a, int b)
	{
		int result = a+(~b + 1); //a + 2's complement of b
		return result ;
		

	}

}
