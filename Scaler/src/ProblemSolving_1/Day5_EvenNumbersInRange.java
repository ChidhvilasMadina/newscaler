/*You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*/
package ProblemSolving_1;

public class Day5_EvenNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4, 5};
		int N=A.length;
		int[][] B= {{0,2},{2,4},{1,4}};
		int M=B.length;
		int[] count=new int[N];
		if(A[0]%2==0) {
			count[0]=1;
		}
		else {
			count[0]=0;
		}
		int c=0;
		for(int i=1;i<N;i++) {
			if(A[i]%2==0) {
				c++;
			}
			count[i]=c;
			System.out.println(count[i]);
		}
		System.out.println("++++++++++++++++++++++++");
		for(int i=0;i<M;i++) {
			int start=B[i][0];
			int end=B[i][1];
			int even_count;
			if(start==0) {
				even_count=count[end];
			}
			else {
				even_count=count[end]-count[start-1];
			}
			System.out.println(even_count);
		}

	}

}
