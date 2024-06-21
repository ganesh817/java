package ch19;

public class Bubblesorting {

	public static void main(String[] args)
	{
		int a[]=new int[] {6,2,5,4,3,8,7,65,12,56,54,12,87,65,12,45,36,9};
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}

	}

}
