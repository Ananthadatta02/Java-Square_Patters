package star_patterns;

import java.util.Scanner;

/*
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
 */

public class SquarePattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==0 || j==1 || i==n-1 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
