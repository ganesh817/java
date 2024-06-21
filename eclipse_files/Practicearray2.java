package ch19;

public class Practicearray2 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,3,2,6,8,5};
		int high=(a[0]>a[1]?a[0]:a[1]),shigh=(a[0]>a[1]?a[0]:a[1]);
		for(int x=1;x<a.length-1;x++)
		{
			if(high>a[x+1]&&shigh<a[x+1])
			{
				shigh=a[x+1];
			}
			else if(high<a[x+1])
			{
				shigh=high;

				high=a[x+1];
			}
		}
		System.out.println(high+" "+shigh);
		
		
	}

}
