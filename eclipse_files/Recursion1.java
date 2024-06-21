package ch19;

public class Recursion1 {

	public static void main(String[] args) 
	{
		User user=new User();
		user.m1(10,0);
		
	}

}
class User {
	void m1(int n,int sum)
	{
		if(n==0)
			System.out.println(sum);
		else
			sum=sum+n;
		    m1(n-1,sum);
		    
	}
}

