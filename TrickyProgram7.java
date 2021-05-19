//Number printing without using loops . //

package Tricky;
import java.util.Scanner;

public class TrickyProgram7 {
	static int count = 1 ;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		Printnumbers(num);
		sc.close();
	}
	static void Printnumbers(int num)
	{
		
		System.out.println(count);
		count++;
		if(count == num+1)
			return;
		Printnumbers(num);
		
	}

}
