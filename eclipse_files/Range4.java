package ch19;

public class Range4 {

	public static void main(String[] args) {
		for(int start=1;start<=100;start++)
		{
		int num=start,temp=num;
	      int rem=num%10;
	       System.out.println(rem==7?temp+"Busy number":temp+"not a busy number");
	       int remainder=num%7;
	System.out.println(rem==0?temp+"Busy number":temp+"not a busy number");

		}
	}

}
