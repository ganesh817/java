package ch19;

public class Patterns2 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++)//r=1 1<=5
		{
			for(int c=5;c>=r;c--)//c=5 5>=1 4>=1 3>=1 2>=1 1>=1
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
