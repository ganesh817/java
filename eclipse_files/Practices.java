package ch19;

public class Practices {

	public static void main(String[] args) {
		int countt=0,value=19,temp=value;
		for(int start=1;start<=value;start++)
		{
			if(value%start==0)
				countt++;
		}
		System.out.println(countt==2?value+" prime":value+"not a  prime");
		int num=temp,sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		int count=0;
         for(int i=1;i<=sum;i++)
         {
        	 if(sum%i==0)
        	     count++;	 
        	 
         }
         if(count==2)
        	 System.out.println(sum+"Twisted prime");
         else
        	 System.out.println(sum+"not a twisted prime");
         
         
         for(int x=1;x<=91;x++)
         {
        	if(91%x==0)
        		System.out.println(x);
        		
         }
	}

}
