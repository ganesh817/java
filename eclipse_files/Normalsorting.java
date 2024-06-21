package ch19;

public class Normalsorting {

	public static void main(String[] args)
	{
		int a[]=new int[] {50,40,90,20,10};
		
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
				
			}
			
		}
		for(int temp:a)
			System.out.println(temp);

	}

}
