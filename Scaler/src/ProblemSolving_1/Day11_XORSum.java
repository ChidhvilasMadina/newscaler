/*Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.

where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.

Note: Bitwise XOR operator will return 1, if both bits are different. If bits are same, it will return 0.
*/

package ProblemSolving_1;

public class Day11_XORSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=15;
		int B=18;
		int x=A^B;
		System.out.println(x);
	}

}
