//Program to check Odd or Even without using If-else ladder //

package Tricky;
import java.util.Scanner;

public class TrickyProgram9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check odd or even : ");
		int num = sc.nextInt();
		OddEven(num);
		sc.close();
	}
	static void OddEven(int num)
	{
		switch(num%2)
		{
			case 0 : System.out.println("Number is Even .");
					 break ;
			case 1 : System.out.println("Number is Odd .");
					 break ;
		}
	}

}
