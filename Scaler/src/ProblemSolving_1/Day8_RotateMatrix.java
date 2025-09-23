/*You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.
*/

package ProblemSolving_1;

public class Day8_RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				int temp=A[i][j];
				A[i][j]=A[j][i];
				A[j][i]=temp;
			}
		}
		for(int i=0;i<N;i++) {
			int p=0,q=N-1;
			while(p<q) {
				int temp=A[i][p];
				A[i][p]=A[i][q];
				A[i][q]=temp;
				p++;q--;				
			}			
		}
		for(int i=0;i<N;i++) {
			System.out.print("{");
			for(int j=0;j<N;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println("}");
		}

	}

}
