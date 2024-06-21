package ch19;

public class Method7 {

	public static void main(String[] args)
	{ 
		Palindrom palindrome=new Palindrom();
		for(int i=1;i<=100;i++)
		{
			 
			if(palindrome.pal(i).equals("palindrome"))
				System.out.println(i+" palindrome");
		}
		
		
		
		
	}

}
class Palindrom
{
	String pal(int num)
	{
		int i=num,rev=0;
		while(i>0)
		{
			int rem=i%10;
			rev=rev*10+rem;
			i/=10;
		}
		if(rev==num)
			return "palindrome";
		else 
			return "not palindrome";
	}
}



