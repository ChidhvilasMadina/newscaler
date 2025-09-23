/*Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
 * 
 */

package ProblemSolving_2;

public class Day020_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=9;
		System.out.println(factoral(A));

	}

	private static int factoral(int a) {
		// TODO Auto-generated method stub
		if(a==1) {
			return 1;
		}
		return factoral(a-1)*a;
	}

}
