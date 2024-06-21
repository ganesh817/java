package ch19;


public class Stringprintabc {

	public static void main(String[] args) 
	{
		String s="abc";
		String s1="xyz";
		int count=0;
		 for(int x=0;x<=s.length();x++)
		 {
			 for(int y=x+1;y<=s.length();y++)
			 {
				 System.out.println(s.substring(x, y));
				 count++;
			 }
			 
		 }
		 System.out.println("count : "+count);
		 System.out.println("----------------------------------");
//		 String s2=s.concat(s1);//abcxyz
//		 System.out.println(s2);
//		 String s3=s1.replaceAll(s1, s2);//xyz abcxyz
//		 System.out.println(s3);
////		 String s4=s.replace(0, 0)
		 for(int x=0;x<=s1.length();x++)
		 {
			 for(int y=x+1;y<=s1.length();y++)
			 {
				 System.out.println(s1.subSequence(x,y));
			 }
		 }	 
			 System.out.println("-------------------------");
			 StringBuilder sb=new StringBuilder("hello");
			 StringBuilder sb1=new StringBuilder("hello");
			System.out.println(sb.append(123));
			
			 System.out.println(sb.capacity());
			 
			 String s3="mom",s4="xyz";
			 
			 System.out.println(s.concat(s1));
			 StringBuffer sb2=new StringBuffer("hello");
			 String s2=new String("hello");
			 System.out.println(sb2.equals(s2));
			 System.out.println(sb.equals(sb2));
			 System.out.println(sb.equals(sb1));
			 System.out.println(sb.equals(s2));
			 System.out.println(sb1.delete(0, 4));
			 System.out.println(sb2.replace(0, 3, "12"));
			 
			 
			 String res="";
				res =new StringBuffer("dgvgbh").reverse().toString();
				System.out.println(res);
				if(res.compareTo(s3)==0)
					System.out.println("palindrome");
				else 
					System.out.println("not palindrome");
				
				
				
				
		 }
	}


