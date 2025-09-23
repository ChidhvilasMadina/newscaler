/*You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
*/


package ProblemSolving_1;

public class Day8_AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		int M=A[0].length;
		int[][] B= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i=0;i<N;i++) {
			System.out.print("{");
			for(int j=0;j<M;j++) {
				A[i][j]+=B[i][j];
				System.out.print(A[i][j]+" ");
			}
			System.out.println("}");
		}
		

	}

}
