package com.toaosocial.problems;


/**
 * Problem : Find the biggest positive integer which not in given array
 * 
 */
public class FindTheBiggestIntegerNotInGıvenArray {

	public static void main(String[] args) {
		// test data
		int[] a = { 1, 3, 6, 4, 1, 2 };
		int[] b = { 1, 2, 3 };
		int[] c = { -1, -3 };
		
		
		FindTheBiggestIntegerNotInGıvenArray solution = new FindTheBiggestIntegerNotInGıvenArray();
		
		System.out.println(solution.solution(a));
		System.out.println(solution.solution(b));
		System.out.println(solution.solution(c));
	}

	
	/**
	 * 
	 * @param testDataArray
	 * @return
	 */
	public int solution(int[] testDataArray) {

		int smallest = 1;
		
		for (int i = 0; i < testDataArray.length; i++) {
			if (testDataArray[i] > 0) { 
				if ( ((testDataArray[i] - smallest) > 1) || ((testDataArray[i] - smallest) == 0) )
					smallest = smallest + 1;
				else if ((testDataArray[i] - smallest) == 1)
					smallest = testDataArray[i] + 1;				
			}
		}

		return smallest;
	}

}
