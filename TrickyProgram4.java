//Multiplication of 2 numbers without using '*' operator//

package Tricky;
import java.util.Scanner;

public class TrickyProgram4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("The product of 2 numbers is : "+Mul(a , b));
		sc.close();
	}
public static int Mul(int a, int b)
	{
	
		int i ; 
		int pro = 0 ;
		if(b < 0)
		{
			b = -b ;
			a = -a ;
		}
		for(i = 1 ; i <= b ; i++)
		{
			pro = pro + a ;
		}
		return pro ; 
	}

}
