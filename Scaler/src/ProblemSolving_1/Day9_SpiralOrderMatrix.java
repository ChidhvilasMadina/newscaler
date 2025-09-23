/*Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and 
 * return the generated square matrix.
 */

package ProblemSolving_1;

public class Day9_SpiralOrderMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=4;
		int[][] arr=new int[A][A];
		int R=0,C=0,N=A,num=1;
		while(N>1) {
			for(int i=0;i<N-1;i++) {
				arr[R][C]=num;
				C++;
				num++;
				//System.out.println(arr[R][C]);
			}
			for(int j=0;j<N-1;j++) {
				arr[R][C]=num++;
				R++;
			}
			for(int i=0;i<N-1;i++) {
				arr[R][C]=num++;
				C--;
			}
			for(int j=0;j<N-1;j++) {
				arr[R][C]=num++;
				R--;
			}
			C++;
			R++;
			N-=2;
			if(N==1) {
				arr[R][C]=num++;
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}


