//Adding of 2 numbers without using '+' operator//

package Tricky;
import java.util.Scanner;

public class TrickyProgram1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("The result of 2 numbers is : "+add(a , b));
		sc.close();
	}
public static int add(int a, int b)
	{
		int result = a-(-b);
		return result ;
		

	}

}
