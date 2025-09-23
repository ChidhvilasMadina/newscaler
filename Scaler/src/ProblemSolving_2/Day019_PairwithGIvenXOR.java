/*Given an integer array A containing N distinct integers.
Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.
*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_PairwithGIvenXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {};
		int N=A.length;
		int B=6;
		int count=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			int pair=B^A[i];
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
