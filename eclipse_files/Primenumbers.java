package ch19;

public class Primenumbers {

	public static void main(String[] args) {
		for(int x=1;x<=100;x++)
		{
			int count=0;
			for(int start=1;start<=x;start++)
			{
				if(x%start==0)
				{
					count++;
				}
			}
			if(count==2)
			System.out.println(x+" is prime number");
		}

	}

}
