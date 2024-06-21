package ch19;

public class Loops 
{

	public static void main(String[] args) 
	{
		int a=0,b=1,c=1,d,start,count=10;
		
		System.out.print(a+" "+b+" "+c+" ");
		for(start=3;start<count;start++)
		{
			d=a+b+c;
			System.out.print(d+" ");
			a=b;b=c;c=d;
		}
	}

}
