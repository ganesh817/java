package ch19;

public class Pattern8 {

	public static void main(String[] args) {
		int i=1;
		for(int r=1;r<=10;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
		}

	}

}
