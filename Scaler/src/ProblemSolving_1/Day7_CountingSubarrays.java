/* Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
*/

package ProblemSolving_1;

public class Day7_CountingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 11, 2, 3, 15};
		int N=A.length;
		int B=10;		
		int count=0;
		for(int i=0;i<N;i++) {
			int sum=0;
			for(int j=i;j<N;j++) {
				sum+=A[i];
				if(sum<B) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
