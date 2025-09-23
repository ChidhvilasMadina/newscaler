/*Given an integer array A of size N, find the first repeating element in it.






We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.
*/


package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day018_FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {10, 5, 3, 4, 3, 5, 6};
		int N=A.length;
		Map<Integer,Integer> rep=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(rep.containsKey(A[i])) {
				System.out.println("the first repeating element is "+A[i]);
				return;
			}
			else {
				rep.put(A[i], 1);
			}
		}
		System.out.println("The array does not have any Repeated elements");

	}

}
