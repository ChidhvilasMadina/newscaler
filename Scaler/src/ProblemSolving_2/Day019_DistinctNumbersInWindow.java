/*You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.
*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_DistinctNumbersInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {1, 2, 1, 3, 4, 3};
		int N=A.length;
		int B=3;	
		int[]Arr=new int[N-B+1];
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<B;i++) {
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}
			else {
				hm.put(A[i], 1);
			}
		}
		Arr[0]=hm.size();
		int start=1,end=B;
		for(int i=start;end<N;i++) {
			if(hm.containsKey(A[end])) {
				hm.put(A[end], hm.get(A[end])+1);
			}
			else {
				hm.put(A[end], 1);
			}
			
			hm.put(A[i-1], hm.get(A[i-1])-1);
			if(hm.get(A[i-1])<1) {
				hm.remove(A[i-1]);
			}
			int b=hm.size();
			Arr[i]=hm.size();
			end++;
		}
		for(int i=0;i<Arr.length;i++) {
			System.out.println(Arr[i]+" ");
		}
		

	}

}
