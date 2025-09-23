/* given an array in which every consecutive pair have oposite sign.
 * Arrange the array in increasing order such that alternate number has oposite sign's stating with a negetive number .
 */

package ProblemSolving_2;

public class Day016_Contest2_problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {8,9,-1,-3,0,8,-9,-8,};
		int N=A.length;
		int p=1;int n=0;
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			if(A[i]<0) {
				arr[n]=A[i];
				n+=2;
			}
			else {
				arr[p]=A[i];
				p+=2;
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
