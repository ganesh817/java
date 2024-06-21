package ch19;


public class Stringpalindrome {

	public static void main(String[] args) 
	{
		String s="madam arora teaches malayalam";
		String a[]=s.split(" ");
//		for(String temp:a)
//		{
//			System.out.println(temp);
//			
//		}
		
		for(int x=0;x<a.length;x++)
		{
			String res="";
			res =new StringBuffer(a[x]).reverse().toString();
			if(a[x].equals(res))
				
			{
				System.out.println(a[x]+" "+"palindrome");
			}
//			System.out.println(a[x]);	
			
		}
	}

}
