package ch19;

public class Nestedloop 
{

	public static void main(String[] args) 
	{
		int num=13,count=0;
        for(int x=1;x<=num;x++)
        {
       	 if(num%x==0)
       	 {
       		 count++;
       	 }
       	 
        
        int rev=0,temp=num;
        for(;temp>0;temp=temp/10)
        {
        	int rem=temp%10;
        	rev=rev*10+rem;
        	
        
        int num1=rev,start=1,countt=0;
        while(start<=rev)
            {
            if(rev%start==0)
        	{
        countt++;
        	}
            start++;
            }
        if(countt==2)
        	System.out.println(num1+" "+num+" is twisted prime");
        }
	    }
       
		
	}
}
