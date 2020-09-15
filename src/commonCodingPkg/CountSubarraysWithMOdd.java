package commonCodingPkg;
import java.util.*; 

public class CountSubarraysWithMOdd {
 

	static int countSubarrays(int a[],int n, int m) 
	{ 
		
		int count = 0; 

		
		for (int i = 0; i < n; i++) 
		{ 
			int odd = 0; 
			for (int j = i; j < n; j++) 
			{ 
				if (a[j] % 2 !=0) 
					odd++; 
	
				
				if (odd == m) 
					count++; 
			} 
		} 
		
		return count; 
	} 
	public static void main (String[] args) 
	{ 
		int a[] = {2, 2, 5, 6, 9, 2, 11 }; 
		int n = a.length; 
		int m = 2; 
		
		System.out.println(countSubarrays(a, n, m)); 
	} 
} 


