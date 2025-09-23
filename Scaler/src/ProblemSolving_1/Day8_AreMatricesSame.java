/*You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.
NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.
*/

package ProblemSolving_1;

public class Day8_AreMatricesSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		int M=A[0].length;
		int[][] B= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(A[i][j]!=B[i][j]) {
					System.out.println("Given matrix are not same");
					return;
				}
			}
		}
		System.out.println("Given matrix are same");

	}

}
