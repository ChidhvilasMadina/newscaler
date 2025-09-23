/*The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number using recursion.

Given that F0 = 0 and F1 = 1.
*/
package ProblemSolving_2;

public class Day020_Fabinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=9;
		int ans=fabinacci(A);
		System.out.println(ans);

	}

	private static int fabinacci(int a) {
		if(a==0) {
			//System.out.println("0"+ " ");
			return 0;
		}
		if(a==1) {
			//System.out.println("1"+ " ");
			return 1;
		}
		//System.out.println(fabinacci(a-1)+fabinacci(a-2));
		return fabinacci(a-1)+fabinacci(a-2);
		
	}

}
