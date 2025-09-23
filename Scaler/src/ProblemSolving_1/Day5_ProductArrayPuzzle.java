/*Given an array of integers A, 
 * find and return the product array of the same size 
 * where the ith element of the product array will be equal to 
 * the product of all the elements divided by the ith element of the array.
 */
//Note: It is always possible to form the product array with integer (32 bit) values. 
//Solve it without using the division operator.

package ProblemSolving_1;

public class Day5_ProductArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5, 1, 10, 1};
		int N=A.length;
		long product=1;
		long[] ans=new long[N];
		for(int i=0;i<N;i++) {
			product*=A[i];
		}
		for(int i=0;i<N;i++) {
			ans[i]=product/A[i];
			System.out.println(ans[i]);
		}
		
	}

}
