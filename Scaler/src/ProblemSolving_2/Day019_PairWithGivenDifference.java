/*Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.
*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_PairWithGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {5,2, 10, 3, 2, 50, 80};
		int N=A.length;
		int B=78;
		int paircount=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			int d=B-A[i];
			int D=A[i]-B;
			if(hm.containsKey(D)) {
				paircount+=hm.get(D);				
			}
			if(hm.containsKey(d)) {
				paircount+=hm.get(d);				
			}
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}
			else {
				hm.put(A[i],1);
			}			
			
		}
		System.out.println(paircount);
	}

}
