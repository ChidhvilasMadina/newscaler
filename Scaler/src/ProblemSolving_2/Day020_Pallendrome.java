/*
 * Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.
 */

package ProblemSolving_2;

public class Day020_Pallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="maddfam";
		int s=0,e=A.length()-1;
		boolean ans=pallendrome(A,s,e);
		if(ans) {
			System.out.println("The Given string is a pallendrome");
		}
		else {
			System.out.println("The Given string is not a pallendrome");
		}

	}
	private static boolean pallendrome(String a,int s, int e) {
		// TODO Auto-generated method stub
		char left=a.charAt(s);
		char right=a.charAt(e);
				if(s>e) {
					return true;
				}
		if(left==right && pallendrome(a,s+1,e-1)) {
			return true;
		}
		return false;
	}

}
