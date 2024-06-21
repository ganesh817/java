package ch19;
import java.util.Arrays;

public class Stringanagram {

	public static void main(String[] args) 
	{
		
		String s1="silent";
		String s2="listen";
		
		
		if(s1.length() != s2.length())
		{
			System.out.println("not anagram");
			
		}
		else
		{
			char[] string1=s1.toCharArray();
			char[] string2=s2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
	}
}
