package ch19;

public class Patterns5 {

	public static void main(String[] args)
	{ char ch='A';
		for(int r=1;r<=6;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}

