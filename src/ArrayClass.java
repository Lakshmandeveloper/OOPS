import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		int a[]= {4,2,1,5,7,9,0};
		for(int i:a) 
			System.out.print(i+" ");
		System.out.println();
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		 String s[] = {"xyz", "abcde", "pqr", "mno"};
		 Arrays.sort(s);
	        for(String u : s) 
	            System.out.print(u + " ");
	        
	        System.out.println();
		int b[]= {1,2,4,7,9,0,23,34};
		System.out.println(Arrays.binarySearch(b, 23));
		System.out.println(Arrays.binarySearch(b, 20));
		
		int[] c= {1,2,4};
		int[]  d= {1,2,4};
		System.out.println(Arrays.equals(c, d));
		
		
		}

	}



