package ch19;

public class Practicearray {

	public static void main(String[] args)
	{
		int[] a=new int[] {11,13,13,7,7,7,23,77,54,1,9,54,65,65,77,89,77,77,89};
		for(int x=0;x<a.length;x++)
		{
			int min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
					
				}
				
			}
			int temp=a[min];
			a[min]=a[x];
			a[x]=temp;
			
		}
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		for(int x=a.length-2;x>=0;x--)
		{
			if(a[a.length-1]!=a[x])
			{
				System.out.println(a[x]);
			break;
			}
			
		}
		
		
		
		

	}

}
