package ch19;

public class StringIndexof {

	public static void main(String[] args) 
	{
		String s="hello good morning";
		String unique="",duplicate="";
		for(int x=0;x<s.length();x++)
		{
			if(s.indexOf(s.charAt(x))==s.lastIndexOf(s.charAt(x)))
			{
				unique+=s.charAt(x);
			}
			else
			{
				if(duplicate.indexOf(s.charAt(x))==-1)
					duplicate+=s.charAt(x);
			}
		}
		System.out.println(unique);
        System.out.println(duplicate);
	}

}
