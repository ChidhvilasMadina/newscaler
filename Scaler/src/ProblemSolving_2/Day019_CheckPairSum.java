/*Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
*/


package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_CheckPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3, 5, 1, 2};
		int N=A.length;
		int b=6;
		int count=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			int pair=b-A[i];
			if(hm.containsKey(pair)) {
				System.out.println("There exist a pair ");
				count+=hm.get(pair);
			}
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}
			else {
				hm.put(A[i], 1);
			}
		}
		//System.out.println(count);
	}



}
