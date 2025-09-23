/*You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
*/

package ProblemSolving_2;

public class Day012_Unset_IthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=15;
		int B=3;
		int bit=1<<B;
		if((A&bit)==bit) {
			A=A^bit;
		}
		System.out.println(A);
	}

}

/*  int num = 1 << B;
if(A & num){
A -= num;
}
return A;
*/