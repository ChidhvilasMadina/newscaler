/*Given an array A that represents the participants of various contests, 
 * where each integer corresponds to a specific learner, and an array B containing the learners for 
 * whom you want to check participation frequency, your task is to find the frequency of each learner 
 * from array B in the array A and return a list containing all these frequencies
 */

package ProblemSolving_2;

import java.util.HashMap;

public class Day018_FreqencyOfElementQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2, 5, 9, 2, 8};
		int[] B= {3,2};
		int N=A.length;
		int M=B.length;
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(freq.containsKey(A[i])) {
				freq.put(A[i],freq.get(A[i])+1);
			}
			else {
				freq.put(A[i],1);
			}
		}
		for(int i=0;i<M;i++) {
			if(freq.containsKey(B[i])) {
				System.out.println(freq.get(B[i]));
			}
			else {
				System.out.println(0);
			}
			
		}
	}

}
