/*You are given a N X N integer matrix. 
 * You have to find the sum of all the minor diagonal elements of A.
 * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] 
		such that i + j = M + 1 (where i, j are 1-based).
 */



package ProblemSolving_1;

public class Day8_MinarDigonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		int M=A[0].length;
		int sum=0;
		for(int i=0;i<N;i++) {
			for(int j=M-1;j>=0;j--) {
				if(i+j+2==M+1) {
					sum+=A[i][j];
					//System.out.println(i+" "+j+ " "+ sum);
				}
				
			}
		}
		System.out.println("--------------"+sum+"-----------------------------");
	}

}
