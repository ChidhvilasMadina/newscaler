/*Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
*/

package ProblemSolving_2;

import java.util.HashMap;

public class Day018_SubarraySum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4, 5};
		int N=A.length;
		HashMap<Integer,Integer> freq=new HashMap<>();
		freq.put(A[0], 1);
		for(int i=1;i<N;i++) {
			A[i]+=A[i-1];
			if(freq.containsKey(A[i])) {
				freq.put(A[i], freq.get(A[i])+1);
			}
			else {
				freq.put(A[i], 1);
			}
		}
		for(int i=0;i<N;i++) {
			if(A[i]==0||freq.get(A[i])>1) {
				System.out.println("Sub array existis");
				return;
			}
		}
		System.out.println("Subarray dosnot exists");
	}

}
