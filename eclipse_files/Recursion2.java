package ch19;

public class Recursion2 {

	public static void main(String[] args) 
	{
		Rec rec=new Rec();
		System.out.println(rec.m1(10));

	}

}
class Rec {
	int m1 (int n)
	{
		if(n==0)
			return 0;
		else
			return n+m1(n-1);
	}
}
