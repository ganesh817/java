package ch19;

public class Stringdigitsadding {

	public static void main(String[] args) 
	{
		String s="abc25de6h7";
				//01234567
		int sum=0;
		String temp="";
		for(int x=0;x<s.length();x++)
		{//4  5   6
			if(Character.isDigit(s.charAt(x)))
			{
				if(x<s.length()-1 && Character.isDigit(s.charAt(x+1)))
				{
					temp+=s.charAt(x);//21
				}
				else
				{
					temp+=s.charAt(x);
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
		}
		System.out.println(sum);

	}

}
