package ch19;

public class Practice {

	public static void main(String[] args)
	{
		for(int x=1;x<=100;x++)
		{ 
			int temp=x,sum=0,count=0;
			while(temp>0)
			{
				count++;
				temp=temp/10;
			}
			temp=x;
			while(temp>0)
			{ 
				int rem=temp%10;
				sum=sum+(int)Math.pow(rem,count);
				temp/=10;
			}
			if(x==sum)
				System.out.println(x+" arm strong");
		}

	}

}
