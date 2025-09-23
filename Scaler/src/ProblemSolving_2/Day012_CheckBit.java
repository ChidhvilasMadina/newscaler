/*You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
*/

package ProblemSolving_2;

public class Day012_CheckBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=4,B=2;
		if((A&(1<<B))==(1<<B)) {
			System.out.println(B+" th bit in "+A+" is set");
		}
		else {
			System.out.println(B+" th bit in "+A+" is NOT set");
		}

	}

}
