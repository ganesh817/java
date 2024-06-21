package ch19;

public class Method5 {

	public static void main(String[] args) 
	{
		Test test=new Test();
		test.palindrome();
		
	}

}
class Test{
	
	void palindrome()
	{
		for(int x=1;x<=500;x++)
		{
			int num=x,rev=0;
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			System.out.println(x==rev?x+"palindrome":x+"not palindrome");
		}
		
		
		
		
	}
}
