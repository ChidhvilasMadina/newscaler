/*Given an array A of N integers, return the number of unique elements in the array.
 * 
 */


package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day018_CountDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3, 3, 3, 9, 0, 1, 0};
		int N=A.length;
		Map<Integer,Integer> distinct=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(distinct.containsKey(A[i])) {
				distinct.put(A[i], distinct.get(A[i])+1);
			}
			else {
				distinct.put(A[i], 1);
			}
		}
		System.out.println(distinct.size());

	}

}
