package ch19;

public class Patterns9 {

	public static void main(String[] args) 
	{
		int rows=7;
		for(int r=1;r<=rows;r++)
		{ 
			
			for(int c=1;c<=rows;c++)
				
			{ if(r==1||r==rows||c==1||c==rows||r+c==rows+1||r==c)
				
				System.out.print("# ");
			else
				System.out.print("  ");
			}
			System.out.println();
			
		}
		

	}

}
