/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing
*/

package ProblemSolving_1;

public class Day10_SumOfOddIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4, 5};
		int N=A.length;
		int[][] B= {{0,2},{1,4}};
		int M=B.length;
		int sum=0;
		A[0]=0;
		int[] ans=new int[M];
		for(int i=1;i<N;i++) {
			if(i%2!=0) {
				sum+=A[i];
				A[i]=sum;
				//System.out.println(A[i]+" ");
			}
			else
				A[i]=sum;
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(A[i]);
		}
		System.out.println("---------");
		for(int i=0;i<M;i++) {
			int start=B[i][0];
			int end=B[i][1];
			if(start==0) {
				ans[i]=A[end];
			}
			else
			ans[i]=A[end]-A[start-1];
			System.out.println(ans[i]);
		}
		

	}

}
