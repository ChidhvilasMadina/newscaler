/*Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {0, 0, 0};
		int N=A.length;
		int B=0;
		Map<Integer,Integer> hm=new HashMap<>();
		int sum=0,count=0;
		for(int i=0;i<N;i++) {
			sum+=A[i];
			if(sum==B) {
				count++;
			}
			if(hm.containsKey(sum-B)) {
				count+=hm.get(sum-B);
			}
			if(hm.containsKey(sum)) {
				hm.put(sum, hm.get(sum)+1);
			}
			else {
				hm.put(sum, 1);
			}
		}
		System.out.println(count);

	}

}
