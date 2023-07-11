package com.toaosocial.algorihtms;

public class Solution {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 4, 1, 2 };
		int[] b = { 1, 2, 3 };
		int[] c = { -1, -3 };
		
		Solution solution = new Solution();
		System.out.println(solution.solution(a));
		System.out.println(solution.solution(b));
		System.out.println(solution.solution(c));
	}

	public int solution(int[] A) {

		int smallest = 1;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) { 
				if ( ((A[i] - smallest) > 1) || ((A[i] - smallest) == 0) )
					smallest = smallest + 1;
				else if ((A[i] - smallest) == 1)
					smallest = A[i] + 1;				
			}
		}

		return smallest;
	}

//	public int solution(int[] A) {
//		
//		if (A[A.length-1] < 1) return 1;
//		
//		for (int i = 1; i < A.length; i++) {
//			if ((A[i] - A[i-1]) > 1)
//				return A[i-1] + 1;
//		}
//		
//		return A[A.length-1] + 1;
//	}
//	
	static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		return arr;

	}
}
