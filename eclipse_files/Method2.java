package ch19;

public class Method2 {

	public static void main(String[] args)
	{
		Abc obj=new Abc();
		String s=obj.palindrome();
		System.out.println(s);
		

	}
}
class Abc{
	int num=121, temp=num;
	int reverse()
	{		
		int rev=0;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			
		}
		return rev;
		}

	
	String palindrome()
	{
	int value=reverse();
	{
		if(value==num)
			return "Palindrome";
		else
			return "not palindrome";
	}
	
	
}
}
