//Division of 2 numbers without using '/' operator//

package Tricky;
import java.util.Scanner;

public class TrickyProgram5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("The Division of 2 numbers is : "+Div(a , b));
		sc.close();
	}
public static int Div(int a, int b)
	{
			int x = 0 ;
			int y = 0 ;
			if(a == 0 || b == 0)
			{
				return 0 ;
			}
			if(a < 0)
			{
				a = -a ;
				x = 0 ;
				if(b < 0)
				{
					b = -b ;
					x = 1 ;
				}
			}
			if(b < 0)
			{
				b = -b ;
				x = 1 ;
				if(a < 0)
				{
					a = -a ;
					x = 0 ;
				}
			}
			while(a >= b)
			{
				a -= b ;
				y++;
			}
			if(x == 1)
			{
				y = -y ;
			}
			return y ;
		}
}