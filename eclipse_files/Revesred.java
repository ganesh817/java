package ch19;

public class Revesred {

	public static void main(String[] args) {
	int num=150000,rev=0,re_rev=0,count=0;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		if(rev==0)
		{
			count++;
		}
		num=num/10;
	}
	  for(;rev>0;rev/=10)
	  {
		  int re_rem=rev%10;
		  re_rev=re_rev*10+re_rem;
		  
	  }
	  re_rev*=(int)Math.pow(10,count);
	  System.out.println(re_rev);
	}

}
