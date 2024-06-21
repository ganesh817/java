package ch19;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]=new int[] {15,7,9,11,12,13,11,11,8};
		
			int count=0;
			for(int temp:a)
			{
				count++;
			
			}
			System.out.println("array length : "+count);
		   int repeat=0,last=0;
			for(int x=0;x<count;x++)
		 {
			 if(a[x]==11)
			 {
				 last=x;
				 repeat++;
				 if(repeat==1)
				 {
					 System.out.println("first occurence : "+x);
				 }
				 System.out.println("the element is found in index :"+x);
			 }
			
		 }
			 System.out.println(repeat==0?"element is not occuring":"element is occuring");
			 System.out.println("how many times repeated : "+repeat);
			 System.out.println("last occurence : "+last);
			
	
	
	}	
}
	
