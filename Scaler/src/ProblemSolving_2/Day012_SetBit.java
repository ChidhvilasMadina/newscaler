/*You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
*/


package ProblemSolving_2;

public class Day012_SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=4,B=5;
		int bit1=1<<4;
		int bit2=1<<B;
		int ans=0;
		ans=ans |bit1 |bit2;
		System.out.println(ans);
	}

}
