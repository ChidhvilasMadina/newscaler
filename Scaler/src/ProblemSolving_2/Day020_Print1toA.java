/*You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.
*/

package ProblemSolving_2;

public class Day020_Print1toA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=7;
		printnum(A);

	}

	private static void printnum(int a) {
		// TODO Auto-generated method stub
		if(a==1) {
			System.out.print(1+" ");
			return;
		}
		printnum(a-1);
		System.out.print(a+" ");
		
	}

}
