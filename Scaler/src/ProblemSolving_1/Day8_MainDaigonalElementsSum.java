/*You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
*/


package ProblemSolving_1;

public class Day8_MainDaigonalElementsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		int M=A[0].length;
		int sum=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(i==j) {
					sum+=A[i][j];
					System.out.print(A[i][j]+"+");
				}
			}
		}
		System.out.println("= "+sum);
		

	}

}
