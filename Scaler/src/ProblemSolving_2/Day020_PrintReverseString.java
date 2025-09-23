/*
 * Write a recursive function that takes a string, S, 
 * as input and prints the characters of S in reverse order.
 */

package ProblemSolving_2;

public class Day020_PrintReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="good Morning";
		int N=s.length()-1;

		reverse(s,N);
	}

	private static void reverse(String s,  int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(s.charAt(n));
			return;
		}
		
		System.out.print(s.charAt(n));
		reverse(s,n-1);
		return ;
	}

}
