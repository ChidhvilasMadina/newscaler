/*Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

package ProblemSolving_1;

public class Day11_SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 2, 3, 1};
		int N=A.length;
		int ans=0;
		for(int i=0;i<N;i++) {
			ans=ans^A[i];
		}
		System.out.println(ans);

	}

}
