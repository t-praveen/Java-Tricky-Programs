//Modulo Division using '%' Operator //

package Tricky;
import java.util.Scanner;

public class TrickyProgram6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("The Modulus of 2 numbers is : "+Mod(a,b));
		sc.close();
	}
	static int Mod(int a , int b)
	{
		int q ;
		q = a / b ;
		int mod ;
		mod = a - b * q  ;
		return mod ;
	}

}
