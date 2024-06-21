package ch19;

public class Stringchar {

	public static void main(String[] args)
	{
		String s="Hi12a()&*";
		int num=0,alpha=0,special=0;
		for(int x=0;x<s.length();x++)
		{
			System.out.println(s.charAt(x));
		
		if(s.charAt(x)>='A' && s.charAt(x)<='z')
		{
			alpha++;
		}
		else if(s.charAt(x)>='1' && s.charAt(x)<='9')
			
		{
			num++;
		}
		else
			special++;
		}
		System.out.println("Alphabets : "+alpha);
		System.out.println("Numbers : "+num);
		System.out.println("special : "+special);
		
	}

}
