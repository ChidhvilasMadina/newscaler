/*Give a N * N square matrix A, 
 * return an array of its anti-diagonals. 
 * Look at the example for more details.
 */

package ProblemSolving_1;

public class Day8_AntiDiagnoals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int N=A.length;
		int M=A[0].length;
		
		int row=2*(Math.max(N, M))-1;
		int col=M;
		int index=0;
		int[][] ans=new int[row][M];
		for(int c=0;c<M;c++) {
			int p=0,q=c;
			int secondIndex=0;
			while(p<N && q>=0) {
				ans[index][secondIndex++]=A[p][q];
				p++;q--;
			}
			index++;
		}
		for(int r=1;r<N;r++) {
			int p=r,q=M-1;
			int secondIndex=0;
			while(p<N && q>=0) {
				ans[index][secondIndex]=A[p][q];
				p++;q--;
				secondIndex++;
			}
			index++;
		}
		for(int i=0;i<row;i++) {
			System.out.print("{");
			for(int j=0;j<col;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println("}");
		}

	}

}
