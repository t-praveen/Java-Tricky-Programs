//Adding of 2 numbers using bitwise operator . //

package Tricky;
import java.util.Scanner;

public class TrickyProgram2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		int sum = a ^ b ;
		int carry = a & b ; 
		while(carry!= 0)
		{
				carry <<= 1;
				a = sum ;
				b = carry ;
				sum = a ^ b ;
				carry = a & b ;
		}
		System.out.println("The result of 2 numbers is : "+sum); 
		

	}

}
