package ch19;



public class Arraypractice {

	

	public static void main(String[] args)
	{
		int a[]=new int[101];
		
		for(int x=0;x<a.length;x++)
		{
			a[x]=x;
			
		}
	
		for(int temp:a)
		{
			int count=0,num=temp;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
				System.out.println(temp+" prime number");
		}
		System.out.println("-----------------------------");
		
		int[] b=new int[500];
		for(int x=0;x<b.length;x++)
		{
			b[x]=x;
		}
		for(int temp:b)
		{
			int num=temp,sum=0;
			int digits=0,rem=0;
			while(num>0)
			{
				digits++;
				num/=10;
			}
			 num=temp;
			for(;num>0;num/=10)
			{
				 rem=num%10;
				 sum = sum+ (int)Math.pow(rem,digits);
			}
			if(sum==temp&&temp!=0)
				System.out.println(temp+" armstrong");
		}
		
		System.out.println("--------------------------------------------");
		int c[]=new int[250] ;	
		
		for(int x=0;x<=a.length-1;x++)
		{
			int num=x,rev=0;
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			if(x==rev&&x!=0)
				System.out.println(x+" palindrome");
		}
		
	}

}
