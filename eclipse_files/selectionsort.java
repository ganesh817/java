package ch19;

public class selectionsort {

	public static void main(String[] args) 
	{
		int[] a=new int[] {23,11,15,45,8,3,56};
		int min;
		for(int x=0;x<a.length;x++)
		{
			
		 min=x;
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
			System.out.println(temp);
		}
		
	}

}
