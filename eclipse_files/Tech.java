package ch19;

public class Tech {

	public static void main(String[] args) {
		  
		
		System.out.println("Tech numbers between 1 to 1000000 are: ");      
		for (int i = 1; i <= 10000; i++)   
		{  //i=2025
		  
		int p1 = i % 100;//2025%100=25  
	  
		int p2 = i / 100; //2025/100=20 
	 
		int sum = p1 + p2; //20+25=45 
		 
		if (i == (sum * sum)) //45*45=2025 
		  
		System.out.println(i+" Technical number");
		
		}  
		}  
		 

	}


