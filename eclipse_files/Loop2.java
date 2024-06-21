package ch19;

public class Loop2 {

	public static void main(String[] args) {
                 int num=221,temp=num,rev=0;
                 for(;num>0;num=num/10)
                 {
                	 int rem=num%10;
                	 rev=rev*10+rem;
                 }

                   System.out.println(temp==rev?temp+"palindrome":temp+"not an palindrome");
	}

}
