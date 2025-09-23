/*You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*/
package ProblemSolving_1;

public class Day5_RangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4, 5};
		int N=A.length;
		int[][] Q={{0,0},{1,2}};
		int M=Q.length;
		int[] ans=new int[M];
		for(int i=1;i<N;i++) {
			A[i]=A[i-1]+A[i];
			System.out.println(A[i]);
		}
		System.out.println("---------");
		for(int i=0;i<M;i++) {
			int start=Q[i][0];
			int end=Q[i][1];
			if(start==0) {
				ans[i]=A[end];
			}
			else {
				ans[i]=A[end]-A[start-1];
			}
			
			System.out.println(ans[i]);
		}

	}

}
