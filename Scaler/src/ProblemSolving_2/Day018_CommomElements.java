/*Given two integer arrays, A and B of size N and M, respectively. 
 * Your task is to find all the common elements in both the array.
 * 
NOTE:


Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.
 */

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day018_CommomElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {1, 2, 2, 1};
		int[]B= {2, 3, 1, 2};
		int N=A.length;
		int M=B.length;
		int count=0;
		Map<Integer,Integer> first=new HashMap<>();
		Map<Integer,Integer> second=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(first.containsKey(A[i])) {
				first.put(A[i], first.get(A[i])+1);
			}
			else {
				first.put(A[i], 1);
			}
		}
		for(int i=0;i<M;i++) {
			if(second.containsKey(B[i])) {
				second.put(B[i], second.get(B[i])+1);
			}
			else {
				second.put(B[i], 1);
			}
		}
		for(int i=0;i<N;i++) {
			if(second.containsKey(A[i])) {
				int freq=Math.min(first.get(A[i]),second.get(A[i]));
				count+=freq;
				
				second.remove(A[i]);
			}
		}
		System.out.println("Number of elents that are common in both the arrays are "+ count);

	}

}
