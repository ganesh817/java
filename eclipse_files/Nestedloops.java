package ch19;

public class Nestedloops {

	public static void main(String[] args) {
int num=11,temp=num,rev=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
			
		}
		int count=0;
		for(int start=0;start<=num;start++)
		{
		if(num%start==0)
			{
			count++;
			}
		
        if(count==2&&num==rev)
        	System.out.println(num+" prime number");
		}
	}

}
