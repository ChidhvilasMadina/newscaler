/*You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.
Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

*/

package ProblemSolving_1;

public class Day7_SumOfAllSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2, 1, 3};
		int N=A.length;
		long sum=0;
		
		//regular Approach
		
		for(int i=0;i<N;i++) {
			int tempsum=0;
			for(int j=i;j<N;j++) {
				tempsum+=A[j];
				sum+=tempsum;
			}
		}
		System.out.println(sum+"--------------------");
		
		//contribution aproach
		int total=0;
		for(int i=0;i<N;i++) {
			total+=((i+1)*(N-i)*A[i]);
		}
		System.out.println(total);
	}

}
