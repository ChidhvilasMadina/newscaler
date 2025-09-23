/*You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.
*/

package ProblemSolving_2;

public class Day013_ModArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {4, 3, 5, 3, 5, 3, 2, 1};
		int N=A.length;
		int B=47;
		int t=1;
		long ans=0;
		for(int i=N-1;i>=0;i--) {
			long term=(long)(A[i]*t)%B;
			ans=(ans+term)%B;
			t=(t*10)%B;
		}
		System.out.println(ans);
	}

}
