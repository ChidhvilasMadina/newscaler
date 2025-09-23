/*Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, 
return the remainder on dividing the result with 109+7*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day018_CountSubarraySum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {};
		int N=A.length;
		int count=0;
		int sum=0;
		Map<Integer,Integer> pf=new HashMap<>();
		//pf.put(A[0],1);
		for(int i=0;i<N;i++) {
			sum+=A[i];
			if(pf.containsKey(sum)) {
				pf.put(sum, pf.get(sum)+1);
				count=pf.get(sum);
			}
			else {
				if(sum==0) {
					count++;
				}
				pf.put(sum, 1);
			}
		}
		

	}

}
