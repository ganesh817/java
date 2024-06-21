package ch19;

public class Fact {

	public static void main(String[] args) 
	{
		int num=145,sum=0,temp=num;
		while(num>0)
		{
			int rem=num%10;
			  int fact=1;
             for(int i=1;i<=rem;i++)
             {
            	 fact*=i;
             }
			  System.out.println(fact);
			  sum=sum+fact;
			  num/=10;
		}
		System.out.println(sum==temp?"Strong number":"not a strong number");
	}

}
