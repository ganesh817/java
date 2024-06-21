package ch19;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) 
	{
		int arr1[]=new int[] {10,20,30,40,50};
		int arr2[]=new int[] {10,20,30,40,50};
		
		if(Arrays.equals(arr1,arr2))
			System.out.println("Equal");
		else
			System.out.println("not equal");
		
		System.out.println("--------------------------");
		 int arr3[]=new int[] {10,20,30,40,50};
		 int arr4[]=new int[] {20,10,50,40,30};
		 if(Arrays.equals(arr3, arr4))
			 System.out.println("Equal");
		 else
			 System.out.println("not equal");
		
		

	}

}
