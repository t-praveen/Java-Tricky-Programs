//Program to print Even or odd without using % operator //

package Tricky;
import java.util.Scanner;

public class TrickyProgram12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check even or odd : ");
		int n = sc.nextInt();
		int half = n / 2 ;
		if(n == half*2)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();
	}

}
