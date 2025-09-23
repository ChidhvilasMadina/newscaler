/*Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.
*/


package ProblemSolving_2;

public class Day012_UnsetXBitsFromRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=135;
		int B=4;
		int i=0;
		while(i<=B) {
			if((A&1<<i)==1<<i) {
				A=A^(1<<i);
			}
			i++;
		}
		System.out.println(A);

	}

}
