/*Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
*/

package ProblemSolving_2;

import java.util.Arrays;

public class Day014_ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3, 5, 1};
		int N=A.length;
		Arrays.sort(A);
		int d=A[1]-A[0];
		for(int i=1;i<N;i++) {
			if((A[i]-A[i-1])!=d) {
				System.out.println("The given Array is not in Arithmetic Progression.");
				return;
			}
		}
		System.out.println("The given array is in Arithmetic Progression.");
	}

}
