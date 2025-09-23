/*Write a function that takes an integer and 
 * returns the number of 1 bits present in its binary representation.
 */

package ProblemSolving_2;

public class Day012_NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=7;
		int count=0;
		while(A>0) {
			if((A&1)==1) {
				count++;
			}
			A=A>>1;
		}
		System.out.println(count);
	}

}
