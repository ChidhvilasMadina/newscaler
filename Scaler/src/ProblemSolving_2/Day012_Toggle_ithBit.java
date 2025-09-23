/*You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
*/

package ProblemSolving_2;

public class Day012_Toggle_ithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=345;
		int B=4;
		int bit=1<<B;
	
		System.out.println(A^bit);

	}

}
