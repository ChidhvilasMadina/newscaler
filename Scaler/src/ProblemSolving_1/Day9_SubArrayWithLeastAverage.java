/* Given an array A of size N, find the subarray of size B with the least average.
 * 
 */


package ProblemSolving_1;

public class Day9_SubArrayWithLeastAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3, 7, 90, 20, 10, 50, 40};
		int N=A.length;
		int B=3;
		int sum=0;
		int index=0;
		double ans = 0;
		for(int i=0;i<B;i++) {
			sum+=A[i];
			ans=sum/(double)B;
			index=0;
		}
		int end=B;
		for(int i=1;end<N;i++) {
			sum=sum+A[end]-A[i-1];
			double avg=sum/(double)B;
			if(ans>avg) {
				ans=avg;
				index=i;
			}
			end++;
		}
		System.out.println(ans +" At index "+ index);

	}

}
