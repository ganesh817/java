package ch19;

public class Method6 {

	public static void main(String[] args)
	{
				Method6.findPalin();
	}
	public static boolean palin()
	{
		int num=12321;
		int palin=num;
		int rev=0;
			
			while(palin!=0)
			{
				int rem=palin%10;
				rev=rev*10+rem;
				palin=palin/10;
		}
		return num==rev;
	}
	public static void findPalin()
	{
		
		for(int x=1;x<=100;x++)
		{
			if(palin()) 
				System.out.println(x+" palindrome");
		}
	}
}
	
	
	

